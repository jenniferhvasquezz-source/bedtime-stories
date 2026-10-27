public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the name of the story/file to read
        System.out.println("Enter the name of the story file to read (e.g., goldilocks.txt, hansel_and_gretel.txt, mary_had_a_little_lamb.txt): ");
        String filename = scanner.nextLine();

        // Use try-with-resources to ensure the BufferedReader and FileReader are closed properly
        try (BufferedReader reader = new BufferedReader(new FieReader(filename))) {
            String line;
            // Read each line of the selected story until the end of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            catch (IOException e) {
                System.out.println("An error occured while reading the file: "+ e.getMessage ());
                e.printStackTrace();

        }
    }

    }