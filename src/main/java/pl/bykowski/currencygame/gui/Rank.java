package pl.bykowski.currencygame.gui;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.bykowski.currencygame.entity.CurrencyRank;
import pl.bykowski.currencygame.repo.CurrenctRankRepo;

@Route("rank")
public class Rank extends VerticalLayout {

    @Autowired
    public Rank(CurrenctRankRepo currenctRankRepo) {
        Grid<CurrencyRank> grid = new Grid<>(CurrencyRank.class);

        grid.setItems(currenctRankRepo.findAll());
        add(grid);
    }
}
