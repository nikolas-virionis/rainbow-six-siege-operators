package virionis.nikolas.rainbow.six.siege.operators;

public interface IOperator {
    public void walk(Character direction, Integer speed);
    public void sprint(Character direction, Integer speed);
    public void crouch();
    public void prone();
    public void shoot(Boolean hit, Operator target);
    public void getShot(Integer damage);
    public void ads(Integer speed);
    public void unAds(Integer speed);
}
