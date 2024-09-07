public class Resume {
    private String name;
    private String email;
    private String phoneNumber;
    private String education;
    private String experience;
    private String skills;

    
    public Resume(String name, String email, String phoneNumber, String education, String experience, String skills) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public String getExperience() {
        return experience;
    }

    public String getSkills() {
        return skills;
    }
    public void displayResume() {
        System.out.println("=== Resume Details ===");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Education: " + education);
        System.out.println("Experience: " + experience);
        System.out.println("Skills: " + skills);
    }
}
