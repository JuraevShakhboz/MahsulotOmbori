package org.najot.service;

import org.najot.dao.MaxsulotDAO;
import org.najot.model.Maxsulot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaxsulotServiceImpl implements MaxsulotService{

    @Autowired
    private MaxsulotDAO maxsulotDAO;
    @Override
    public Maxsulot getMaxsulotById(Integer id) {
        return maxsulotDAO.selectMaxsulotById(id);
    }
    @Override
    public List<Maxsulot> getMaxsulotList() {
        return maxsulotDAO.selectAllMaxsulot();
    }
    @Override
    public boolean addMaxsulot(String nomi, float narxi) {
        Maxsulot maxsulot = new Maxsulot(nomi, (double) narxi);
        return maxsulotDAO.insertMaxsulot(maxsulot);
    }
    @Override
    public boolean updateMaxsulot(Integer id, String nomi, float narxi) {
        Maxsulot maxsulot = new Maxsulot(nomi, (double) narxi);
        maxsulotDAO.updateMaxsulot(id, maxsulot);
        return true;
    }
    @Override
    public boolean deleteMaxsulot(Integer id) {
        return maxsulotDAO.deleteMaxsulot(id);
    }
}
