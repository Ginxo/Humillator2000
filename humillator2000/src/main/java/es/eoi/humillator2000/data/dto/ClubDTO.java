package es.eoi.humillator2000.data.dto;

import es.eoi.humillator2000.data.entity.Match;

import java.util.Set;

public class ClubDTO {
    private Integer id;
    private String name;
    private Set<Match> matches;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }
}
