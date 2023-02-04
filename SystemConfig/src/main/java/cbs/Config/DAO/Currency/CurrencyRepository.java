package cbs.Config.DAO.Currency;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, String> {
}
