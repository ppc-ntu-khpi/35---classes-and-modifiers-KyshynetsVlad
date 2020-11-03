package domain;

public class Customer {
private int ID = 1;
private boolean IsNew = true;
private float total = 1000.0F;
public int getID() {
    return ID;
    }
    public boolean getIsNew() {
    return IsNew;
    }
    public float gettotal() {
    return total;
    }


    public void setID(int newID) {
        if ( newID > 0 ) {
            ID = newID;
        }
    }
    public void setIsNew(boolean newIsNew) {
        if ( newIsNew == true ) {
            IsNew = newIsNew;
        }
    }
    public void settotal(float newtotal) {
        if ( newtotal > 0 ) {
            total = newtotal;
        }
    }
}
