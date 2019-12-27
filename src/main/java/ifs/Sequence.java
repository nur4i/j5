package ifs;

public interface Sequence {

    int getNext();

    void setStart(int number);

    default void reset(){
    }

}
