package microtrafficsim.core.vis.map.tiles.mesh;

import microtrafficsim.core.map.tiles.TileId;
import microtrafficsim.core.vis.context.RenderContext;
import microtrafficsim.core.vis.map.tiles.layers.FeatureTileLayerSource;
import microtrafficsim.core.vis.mesh.Mesh;
import microtrafficsim.math.Rect2d;


public interface FeatureMeshGenerator {
    interface FeatureMeshKey {}

    FeatureMeshKey getKey(RenderContext context, FeatureTileLayerSource source, TileId tile, Rect2d targer);
    Mesh generate(RenderContext context, FeatureTileLayerSource source, TileId tile, Rect2d target) throws InterruptedException;
}
