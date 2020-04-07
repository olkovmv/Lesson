package Mountaineering;



public class Groups  {
    private Climber[] climbers;
    private boolean getIntoGroup;
    private Mountain mountain;

    public boolean isGetIntoGroup() {
        return getIntoGroup;
    }

    public void setGetIntoGroup(boolean getIntoGroup) {
        this.getIntoGroup = getIntoGroup;
    }

    public Climber[] getClimbers() {
        return climbers;
    }

    public void setClimbers(Climber[] climbers) {
        this.climbers = climbers;
    }

    public Mountain getMountain(Mountain mountain1) {
        return mountain;
    }

    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    private void addClimber(Climber newClimber){
        for (int i = 0; i < climbers.length ; i++) {
            if (climbers[i] == null) {
                setGetIntoGroup(true);
                climbers[i] = newClimber;
                break;
            }

        }
    }



}

