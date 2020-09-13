package homework_solution.lesson8.task4.entities;

import homework_solution.lesson8.task4.validator.ValidatorStub;

public abstract class Entity implements Validatable {
    protected Long id;
    protected String name;

    public Entity(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntity(this);
    }
}
