import java.time.LocalDate;

public class Dog {
    public static void main(String[] args) {
            }
        private String name;
        private String breed;
        private String color;
        private int birthYear;
        private int weight;

        public Dog(String name, String breed, String color, int birthYear, int weight) {
            this.name = name;
            this.breed = breed;
            this.color = color;
            this.birthYear = birthYear;
            // using the setter to set the field value in the constructor makes it possible
            // to use the validation implemented already in the setter
            setWeight(weight);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int getWeight() {
            return weight;
        }

        // making a field private and using setters and getters to access the field
        // gives the possibility of controlling/validating what values can be stored in the field
        public void setWeight(int weight) {
            if (weight > 0 && weight <= 100) {
                this.weight = weight;
            } else {
                this.weight = 20;
            }
        }

        public int getAge() {
            // the age of a dog is current year - birth year
            return LocalDate.now().getYear() - birthYear;
        }

        public String getSize() {
            if (weight < 10) {
                return "small";
            } else if (weight < 25) {
                return "medium";
            } else {
                return "large";
            }
        }
        public void bark() {
            String size = getSize();
            switch (size) {
                case "small":
                    System.out.println("yelp! yelp! yelp!");
                    break;
                case "medium":
                    System.out.println("woof! woof! woof!");
                    break;
                case "large":
                    System.out.println("WOOOF! WOOOF! WOOOF!");
                    break;
            }
        }
    }












