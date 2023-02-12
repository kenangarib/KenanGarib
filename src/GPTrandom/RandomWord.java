package az.coder.task1.GPTrandom;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RandomWord {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        String[] words = {"apple", "pear", "tangerine", "orange", "banana", "strawberry", "grape", "plum", "cantaloupe",
                "pineapple", "mango", "hazelnut", "peach", "kiwi", "lemon", "grapefruit", "watermelon", "papaya", "pomelo",
                "kiwi", "red grape", "red bell pepper", "zucchini", "potato", "tomato", "onion", "garlic", "shallot", "okra",
                "spinach", "leek", "lettuce", "broccoli", "cauliflower", "brussels sprouts", "eggplant","lion", "tiger",
                "bear", "wolf", "fox", "deer", "elephant", "giraffe", "zebra", "rhinoceros", "hippopotamus", "crocodile",
                "alligator", "monkey", "gazelle", "leopard", "cheetah", "puma", "jaguar", "lynx", "wolverine", "otter",
                "seal", "walrus", "whale", "dolphin", "shark", "octopus", "eel", "stingray", "clam", "crab", "lobster", "squid",
                "oyster", "mussel","computer", "laptop", "tablet", "phone", "television", "fridge", "microwave", "oven",
                "toaster", "kettle", "coffee maker", "dishwasher", "washing machine", "dryer", "vacuum cleaner", "lawn mower",
                "power drill", "saw", "screwdriver", "pliers", "wrench", "hammer", "scissors", "stapler", "tape measure",
                "level", "ruler", "compass", "protractor", "clamp", "chisel", "file", "sandpaper", "paint brush","couch",
                "chair", "ottoman", "table", "bed", "dresser", "nightstand", "desk", "bookshelf", "lamp", "rug", "carpet",
                "curtain", "blinds", "mirror", "painting", "clock", "vase", "candle", "plants", "pillow", "blanket", "comforter",
                "sheet", "towel", "bath mat", "soap dispenser", "toothbrush holder", "trash can", "recycling bin", "laundry basket",
                "hangers", "iron", "steamer", "sewing machine", "purse", "wallet", "backpack", "suitcase", "luggage", "umbrella",
                "raincoat", "hat", "scarf", "gloves", "sneakers", "boots", "heels", "flip flops", "slippers", "sandals", "belt",
                "tie", "watch", "jewelry", "perfume", "cologne", "hair brush", "hair dryer", "flat iron", "curling iron",
                "straightener", "makeup brush", "makeup mirror", "makeup bag", "nail polish", "perfume", "cologne", "shampoo",
                "conditioner", "body wash", "lotion", "sunscreen", "razor", "toothpaste", "floss", "mouthwash", "tissues",
                "paper towels", "toilet cleaner", "air freshener", "batteries", "flashlight", "extension cord", "power strip",
                "outlet cover", "light bulb", "bicycle", "skateboard", "roller skates", "scooter", "surfboard", "snowboard",
                "ski","book", "magazine", "newspaper", "notebook", "pen", "pencil", "marker", "crayon", "paint", "canvas",
                "easel", "sketchbook", "photo album", "picture frame", "card", "envelope", "postage stamp", "staple remover",
                "paper clip", "tape", "glue", "scotch tape", "packing tape", "masking tape", "duct tape", "chalk", "whiteboard",
                "dry erase marker", "eraser", "pencil sharpener", "ruler", "compass", "protractor", "calculator", "computer mouse",
                "keyboard", "printer","rose", "daisy", "sunflower", "lily", "tulip", "daffodil", "iris", "peony", "marigold",
                "dandelion", "clover", "violet", "hibiscus", "lilac", "dahlia", "pear", "cactus", "succulent", "fern", "bamboo",
                "palm tree", "pine tree", "oak tree", "maple tree", "willow tree", "apple tree", "cherry tree", "peach tree", "plum tree",
                "olive tree", "lemon tree", "orange tree", "grapefruit tree", "lime tree","pizza", "pasta", "taco", "burrito",
                "sushi", "ramen", "pho", "chowder", "bisque", "gumbo", "paella", "lasagna", "ravioli", "gnocchi", "spaghetti",
                "fettuccine", "linguine", "tagliatelle", "pesto", "carbonara", "bolognese", "marinara", "alfredo", "barbecue",
                "kabob", "gyro", "curry", "stir-fry", "chili", "soup", "stew", "pot roast", "roast chicken", "steak", "hamburger",
                "hotdog", "sandwich", "sub", "wrap", "panini", "croissant", "bagel", "donut", "croquette", "fritter", "dumpling",
                "waffle", "crepe", "pancake", "french toast", "muffin", "cupcake", "brownie", "cheesecake", "tiramisu", "cannoli",
                "gelato", "sorbet", "ice cream", "milkshake", "smoothie", "juice", "soda", "coffee", "tea", "cider", "chocolate",
                "candy", "caramel", "fudge", "taffy", "toffee", "licorice"};
        Scanner input = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;
        int userInputCount = 0;
        long startTime = System.currentTimeMillis();
        long endTime = startTime + TimeUnit.MINUTES.toMillis(1);
        boolean[] usedWords = new boolean[words.length];


        while (System.currentTimeMillis() < endTime) {
            int randomWordIndex = rand.nextInt(words.length);

            while (usedWords[randomWordIndex]) {
                randomWordIndex = rand.nextInt(words.length);
            }
            String randomWord = words[randomWordIndex];
            usedWords[randomWordIndex] = true;
            System.out.print("Enter the word: " + randomWord + " : ");
            String userInput = input.nextLine();
            if (randomWord.equals(userInput)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Incorrect!");
                incorrect++;
            }
            if (!userInput.isEmpty()) {
                userInputCount++;
            }
        }

        System.out.println("Written Words: " + userInputCount + " Correct:" + correct + " Incorrect:" + incorrect);
    }
}
