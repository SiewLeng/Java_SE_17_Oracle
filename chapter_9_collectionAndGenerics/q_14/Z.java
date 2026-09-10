package q_14;

class W {}
class X extends W {}
class Y extends X {}

class Z<Y> {
    // INSERT CODE HERE
    private Y contents;
    W w1 = new W();
    W w2 = new X();
    // Y y1 = new Y();

    
    public Z(Y contents) {
        this.contents = contents;
    }

    public Y getContents() {
        return this.contents;
    }

}