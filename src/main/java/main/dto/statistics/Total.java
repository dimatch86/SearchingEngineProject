package main.dto.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Total {

    private long sites;
    private long pages;
    private long lemmas;
    private boolean isIndexing;
}
