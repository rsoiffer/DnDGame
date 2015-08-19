package creature;

import core.AbstractComponent;
import java.util.ArrayList;

public class WieldingComponent extends AbstractComponent {

    public Object[] held;
    public int hands;

    public WieldingComponent(int hands) {
        setHands(hands);
    }

    public int countHands(Object o) {
        int r = 0;
        for (Object other : held) {
            if (o == other) {
                r++;
            }
        }
        return r;
    }

    public <E> ArrayList<E> getAll(Class<E> c) {
        ArrayList<E> r = new ArrayList();
        for (Object o : held) {
            if (c.isInstance(o)) {
                r.add((E) o);
            }
        }
        return r;
    }

    public void setHands(int hands) {
        this.hands = hands;
        held = new Object[hands];
    }
}
