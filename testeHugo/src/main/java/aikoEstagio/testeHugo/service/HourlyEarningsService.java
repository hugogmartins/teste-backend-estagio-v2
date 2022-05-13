package aikoEstagio.testeHugo.service;

import aikoEstagio.testeHugo.model.HourlyEarnings;
import aikoEstagio.testeHugo.model.Model;

public interface HourlyEarningsService {
    Iterable<HourlyEarnings> searchAll();

    HourlyEarnings searchByModel(Model model);

    void insert(HourlyEarnings hourlyEarnings);

    void update(Model model,HourlyEarnings hourlyEarnings);

    void delete(Model model);
}
