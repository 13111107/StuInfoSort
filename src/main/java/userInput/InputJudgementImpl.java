package userInput;

import constant.StudentType;

/**
 * Created by Administrator on 2018/4/10.
 */
public class InputJudgementImpl implements InputJudgement {
    public boolean inputKindJudge(int kind) {
        int returnKind = 0;
        switch (kind){
            case 1: kind = StudentType.stu_id;return true;
            case 2: kind = StudentType.stu_age;return true;
            case 3: kind = StudentType.stu_score;return true;
            default:
                System.out.println("用户输入有误，请重新输入:");return false;
        }
//        return returnKind;
    }

    public boolean inputFlagJudge(int flag) {
        int returnFlag = 0;
        switch(flag){
            case 1: returnFlag = 1;return true;
            case 2: returnFlag = 2;return true;
            default:
                System.out.println("用户输入有误，请重新输入:");return false;
        }

    }

    public boolean inputEnterJudge(String flag) {
        if(flag.equals("1"))return true;
        return false;
    }
}
