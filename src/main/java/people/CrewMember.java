package people;

public abstract class CrewMember {

    private String name;
    private CrewMemberRank rank;

    public CrewMember(String name, CrewMemberRank rank){
        this.name = name;
        this.rank = rank;
    }

    //Getters
    public String getName() {
        return name;
    }

    public CrewMemberRank getRank() {
        return rank;
    }

    public void setRank(CrewMemberRank rank) {
        this.rank = rank;
    }

    public String relayMessage(String message){
        return message;
    }
}
