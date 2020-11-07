package lections.lesson12.project_model;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Project {

    private Integer id;
    private Date startDate;
    private Date endDate;
    private String name;
    private List<Integer> childIds;
    private Set<Permission> permissions;
    private Project parentProject;

}
