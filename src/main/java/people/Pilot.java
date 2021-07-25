package people;

public class Pilot extends CrewMember {

    private String licenseNumber;

    public Pilot(String name, String licenseNumber) {
        super(name, CrewMemberRank.PILOT);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void promote(){
        if (this.getRank() == CrewMemberRank.PILOT){
            this.setRank(CrewMemberRank.FIRSTOFFICER);
        }
        else {
            this.setRank(CrewMemberRank.CAPTAIN);
        }
    }

    public String flyPlane(){
        return "Flying Plane!!";
    }
}

