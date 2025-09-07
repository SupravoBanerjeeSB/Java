import java.util.*;

class BuckshotRouletteEnhanced {
    static List<String> chamber = new ArrayList<>();
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static int playerHP = 100;
    static int enemyHP = 100;
    static boolean playerTurn = true;

    static boolean playerHasArmor = true;
    static boolean playerHasMedkit = true;

    public static void main(String[] args) {
        loadGun();
        shuffleGun();
        System.out.println("🔫 Welcome to Buckshot Roulette: Enhanced Edition 🔫");
        System.out.println("Survive with health, armor, and medkits. One live round. Let’s begin!");
        pause();

        int round = 1;
        while (!chamber.isEmpty()) {
            System.out.println("\n========= ROUND " + round + " =========");
            showStatus();

            if (playerTurn) {
                System.out.println("\n🧍‍♂️ Your turn. Choose:");
                System.out.println("1) Fire at Enemy");
                System.out.println("2) Use Medkit" + (playerHasMedkit ? "" : " (Unavailable)"));
                System.out.print(">> ");
                String choice = scanner.nextLine();

                if (choice.equals("2") && playerHasMedkit) {
                    useMedkit();
                } else {
                    System.out.println("\n🔫 You aim at the enemy...");
                    pause();
                    fire("Enemy");
                }
            } else {
                System.out.println("\n🤖 Enemy is aiming at you...");
                pause();
                fire("You");
            }

            playerTurn = !playerTurn;
            round++;

            // Check end
            if (playerHP <= 0) {
                System.out.println("💀 You have been defeated!");
                break;
            }
            if (enemyHP <= 0) {
                System.out.println("🏆 You defeated the enemy!");
                break;
            }
        }

        if (chamber.isEmpty() && playerHP > 0 && enemyHP > 0) {
            System.out.println("\n😨 All chambers fired! Both players survived...");
            System.out.println("🕹️ It’s a draw!");
        }

        System.out.println("\n🎮 Game Over.");
    }

    static void loadGun() {
        chamber.clear();
        chamber.add("LIVE");
        chamber.add("BLANK");
        chamber.add("BLANK");
        chamber.add("EMPTY");
        chamber.add("EMPTY");
        chamber.add("EMPTY");
    }

    static void shuffleGun() {
        Collections.shuffle(chamber);
    }

    static void fire(String target) {
        String round = chamber.remove(0);
        System.out.println("👉 Trigger pulled...");
        pause();

        switch (round) {
            case "LIVE":
                System.out.println("💥 BANG! It was a LIVE round!");
                damageTarget(target, 100);
                break;
            case "BLANK":
                System.out.println("🔊 POP! It was a BLANK round.");
                damageTarget(target, 20);
                break;
            case "EMPTY":
                System.out.println("🔇 Click... It was an EMPTY chamber.");
                break;
        }
    }

    static void damageTarget(String target, int damage) {
        if (target.equals("You")) {
            if (playerHasArmor) {
                System.out.println("🛡️ Your armor absorbed the hit!");
                playerHasArmor = false;
            } else {
                playerHP -= damage;
                System.out.println("🩸 You took " + damage + " damage! HP: " + playerHP);
            }
        } else {
            enemyHP -= damage;
            System.out.println("✅ Enemy took " + damage + " damage! Enemy HP: " + enemyHP);
        }
    }

    static void useMedkit() {
        if (playerHP == 100) {
            System.out.println("❤️ Your health is already full!");
        } else {
            playerHP = Math.min(100, playerHP + 50);
            playerHasMedkit = false;
            System.out.println("🩹 You used a medkit. Healed to " + playerHP + " HP.");
        }
    }

    static void showStatus() {
        System.out.println("🔍 Your HP: " + playerHP + " | Armor: " + (playerHasArmor ? "✅" : "❌") + " | Medkit: " + (playerHasMedkit ? "✅" : "❌"));
        System.out.println("🤖 Enemy HP: " + enemyHP);
        System.out.println("🔘 Chambers remaining: " + chamber.size());
    }

    static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
    }
}
