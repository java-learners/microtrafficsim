//package microtrafficsim.core.logic.vehicles.machines.old.impl;
//
//import microtrafficsim.core.logic.nodes.Node;
//import microtrafficsim.core.logic.Route;
//import microtrafficsim.core.map.style.VehicleStyleSheet;
//
//
///**
// * This class extends the default {@code Car} by being able to stand if a boolean is set to true.
// *
// * @author Dominic Parga Cacheiro
// */
//public class BlockingCar extends Car {
//
//    private boolean blocking;
//
//    /**
//     * Default constructor.
//     *
//     * @see Car#Car(long, long, Route)
//     */
//    public BlockingCar(long ID, long seed, Route<Node> route, VehicleStyleSheet style) {
//        super(ID, seed, route, style);
//        blocking = false;
//    }
//
//    /**
//     * Default constructor
//     *
//     * @see Car#Car(long, long, Route, int)
//     */
//    public BlockingCar(long ID, long seed, Route<Node> route, int spawnDelay, VehicleStyleSheet style) {
//        super(ID, seed, route, spawnDelay, style);
//        blocking = false;
//    }
//
//    /**
//     * As the method name says, it toggles the block mode of this car. If blocking is true (false), it becomes false
//     * (true). Blocking means, the vehicle is standing.
//     */
//    public void toggleBlockMode() {
//        blocking = !blocking;
//    }
//
//    /**
//     * As the method name says, it sets the block mode of this car. Blocking (<=> value == true) means, the vehicle is
//     * standing.
//     */
//    public void setBlockMode(boolean value) {
//        blocking = value;
//    }
//
//    /**
//     * @return True, if this car is just standing in blocking mode; false otherwise
//     */
//    public boolean isBlocking() {
//        return blocking;
//    }
//
//    /**
//     * Addition to super-description: while blocking is true, the max velocity is set to 0.
//     */
//    @Override
//    protected int getMaxVelocity() {
//        return blocking ? 0 : super.getMaxVelocity();
//    }
//
//    /**
//     * Addition to super-description: while blocking is true, the dash factor is set to 0.
//     */
//    @Override
//    protected float getDashFactor() {
//        return blocking ? 0 : super.getDashFactor();
//    }
//
//    /**
//     * Addition to super-description: while blocking is true, the dawdle factor is set to 1.
//     */
//    @Override
//    protected float getDawdleFactor() {
//        return blocking ? 1 : super.getDawdleFactor();
//    }
//}