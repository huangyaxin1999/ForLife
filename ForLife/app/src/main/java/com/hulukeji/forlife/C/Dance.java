package com.hulukeji.forlife.C;

import java.util.ArrayList;

public class Dance {
    private String danceName;
    private ArrayList<Curriculum> curriculums;

    public Dance(String danceName, ArrayList<Curriculum> curriculums) {
        this.danceName = danceName;
        this.curriculums = curriculums;
    }

    public String getDanceName() {
        return danceName;
    }

    public void setDanceName(String danceName) {
        this.danceName = danceName;
    }

    public ArrayList getCurriculums() {
        return curriculums;
    }

    public void setCurriculums(ArrayList curriculums) {
        this.curriculums = curriculums;
    }
}
