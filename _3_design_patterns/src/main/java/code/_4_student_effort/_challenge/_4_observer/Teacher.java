package code._4_student_effort._challenge._4_observer;

import java.util.Arrays;

public class Teacher implements ObservedSubject {
    Observer[] obs = new Observer[0];
    @Override
    public void register(Observer obj) {
        this.obs = Arrays.copyOf(this.obs, this.obs.length + 1);
        this.obs[this.obs.length - 1] = obj;
    }

    public void unregister(Observer obj){
        int index=-1;
        for(int i=0;i<obs.length;i++){
            if(this.obs.equals(obj))
                index=i;
            break;
        }
        System.arraycopy(this.obs, index +1, this.obs, index-1, this.obs.length-1-index);
    }
    @Override
    public void notifyObservers(String message){
        for(int i=0;i<this.obs.length;i++)
            this.obs[i].update(message);
    }
    void teach(String topic){
        for(int i=0;i<this.obs.length;i++)
            this.obs[i].update(topic);
    }
}
