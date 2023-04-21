
public enum StudyProfile {

    MEDICINE("Медицина"),
    LAW("Право"),
    PHILOSOPHY("Философия"),
    THEOLOGY("Теология");
    private String profileName;
    StudyProfile(){
    }
    StudyProfile(String profileName){
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

    public StudyProfile setProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    @Override
    public String toString() {
        return getProfileName();
    }
}
