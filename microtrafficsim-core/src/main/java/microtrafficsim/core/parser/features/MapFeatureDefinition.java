package microtrafficsim.core.parser.features;

import microtrafficsim.core.map.FeaturePrimitive;
import microtrafficsim.osm.parser.ecs.Component;
import microtrafficsim.osm.parser.features.FeatureDefinition;
import microtrafficsim.osm.parser.features.FeatureDependency;
import microtrafficsim.osm.primitives.Node;
import microtrafficsim.osm.primitives.Way;

import java.util.Set;
import java.util.function.Predicate;


/**
 * Feature definition for map features. Map features are generated by a {@link MapFeatureGenerator}.
 *
 * @param <T> the type of the feature-primitive.
 * @author Maximilian Luz
 */
public class MapFeatureDefinition<T extends FeaturePrimitive> extends FeatureDefinition {

    /**
     * Creates a new {@code MapFeatureDefinition} with the given properties.
     *
     * @param name           the name of the feature.
     * @param dependency     the dependencies of the feature.
     * @param generator      the generator for the feature.
     * @param nodeMatcher    the predicate to select the nodes that belong to the feature.
     * @param wayMatcher     the predicate to select the ways that belong to the feature.
     * @param nodeComponents the type of {@code NodeEntity}'s {@code Component}s to be initialized
     *                       besides the ones specified by the generator.
     * @param wayComponents  the type of {@code WayEntity}'s {@code Component}s to be initialized
     *                       besides the ones specified by the generator.
     */
    public MapFeatureDefinition(String name, FeatureDependency dependency, MapFeatureGenerator<T> generator,
                                Predicate<Node> nodeMatcher, Predicate<Way> wayMatcher,
                                Set<Class<? extends Component>> nodeComponents,
                                Set<Class<? extends Component>> wayComponents) {
        super(name, dependency, generator, nodeMatcher, wayMatcher, nodeComponents, wayComponents);
    }

    /**
     * Creates a new {@code MapFeatureDefinition} with the given properties.
     *
     * @param name        the name of the feature.
     * @param dependency  the dependencies of the feature.
     * @param generator   the generator for the feature.
     * @param nodeMatcher the predicate to select the nodes that belong to the feature.
     * @param wayMatcher  the predicate to select the ways that belong to the feature.
     */
    public MapFeatureDefinition(String name, FeatureDependency dependency, MapFeatureGenerator<T> generator,
                                Predicate<Node> nodeMatcher, Predicate<Way> wayMatcher) {
        super(name, dependency, generator, nodeMatcher, wayMatcher);
    }

    @Override
    @SuppressWarnings("unchecked")
    public MapFeatureGenerator<T> getGenerator() {
        return (MapFeatureGenerator<T>) super.getGenerator();
    }
}
