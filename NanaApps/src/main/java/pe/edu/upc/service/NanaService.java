package pe.edu.upc.service;

import pe.edu.upc.bean.Nana;
import pe.edu.upc.dao.NanaDao;

import java.util.List;

/**
 * Created by Administrador on 04/04/17.
 */
public class NanaService {

    public List getAllNanas() {
        List countries = new NanaDao().getAllNanas();
        return countries;
    }

    public Nana getNana(int id) {
        Nana country = new NanaDao().getNana(id);
        return country;
    }
}
