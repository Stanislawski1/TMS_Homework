package homework_8.Employees;

public class Accountant implements Employees {
    private String name;
    private String surName;
    private String workExperience;

    public Accountant(String name, String surName, String workExperience) {
        this.name = name;
        this.surName = surName;
        this.workExperience = workExperience;
    }

    @Override
    public void outputData() {
        System.out.println("Accountant: " + name + surName + " Work experience " + workExperience);
    }
}

