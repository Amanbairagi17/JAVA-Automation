package Projects.miniProject3;

class Student{

    private int eno;
    private String name;
    private String branch;
    private int sem;
    private double percentage;

    Student(int eno,String name,String branch,int sem,double percentage){
        this.eno = eno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
        this.percentage = percentage;
    }

    public int getEno(){
        return eno;
    }

    public String getBranch(){
        return branch;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public String toString(){
        return eno + " " + name + " " + branch + " " + sem + " " + percentage;
    }
}

