package logica.builder;

/**
 *
 * @author David Bohorquez
 */
public class Director {

    private EngineerConstructor constructor;

    public void setConstructor(EngineerConstructor constructor) {
        this.constructor = constructor;
    }

    public AbsEngineer getEngineer() {
        return constructor.getEngineer();
    }

    public void buildEngineer() {
        constructor.buildEnginner();
        constructor.buildAccessory();
        constructor.buildTool();
        constructor.buildVehicle();
    }
}
