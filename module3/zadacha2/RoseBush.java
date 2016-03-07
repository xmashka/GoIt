package module3.zadacha2;

import java.util.List;

public class RoseBush {
    private List<Rose> roses;

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    public void getNumberRoses() {
        System.out.println("This RoseBush consist of " + this.roses.size());
    }

}
