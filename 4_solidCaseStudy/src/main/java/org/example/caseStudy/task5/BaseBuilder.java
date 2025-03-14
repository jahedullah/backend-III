package org.example.caseStudy.task5;

public abstract class BaseBuilder<T, B extends BaseBuilder<T, B>> {
    protected abstract T createInstance();

    protected abstract B self();

    public T build() {
        return createInstance();
    }

}
