package simple.crearjavaprogramador.entities;

import com.google.gson.Gson;

public class ProductService extends Product{
    private long minutes = 0;

    public long getMinutes() {
        return minutes;
    }
    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }
    @Override
    public String toJSON() {
        return (new Gson().toJson(this));
    }

}
