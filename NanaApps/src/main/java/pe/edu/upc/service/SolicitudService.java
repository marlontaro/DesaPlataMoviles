package pe.edu.upc.service;

import pe.edu.upc.bean.Solicitud;
import pe.edu.upc.dao.SolicitudDao;

import java.util.List;

/**
 * Created by Administrador on 04/04/17.
 */
public class SolicitudService {
    public Solicitud registrarSolicitud(Solicitud solicitud) {
        Solicitud sol = null;
        try {
            sol = new SolicitudDao().registrarSolicitud(solicitud);
        } catch (Exception ex) {
            ex.printStackTrace();
            sol = null;
        }
        return sol;
    }

    public List getSolicitudesByNana(int idNana) {
        List solicitudes = new SolicitudDao().getSolicitudesByNana(idNana);
        return solicitudes;
    }

    public Solicitud getSolicitud(int id) {
        Solicitud solicitud = new SolicitudDao().getSolicitud(id);
        return solicitud;
    }

    public Solicitud updateSolicitud(Solicitud solicitud) {
        solicitud = new SolicitudDao().updateSolicitud(solicitud);
        return solicitud;
    }
}
