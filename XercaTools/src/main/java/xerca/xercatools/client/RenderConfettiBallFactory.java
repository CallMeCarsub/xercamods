<<<<<<<< HEAD:XercaConfetti/src/main/java/xerca/xercaconfetti/client/RenderConfettiBallFactory.java
package xerca.xercaconfetti.client;
========
package xerca.xercatools.client;
>>>>>>>> upstream/fabric-1.21.11:XercaTools/src/main/java/xerca/xercatools/client/RenderConfettiBallFactory.java

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
<<<<<<<< HEAD:XercaConfetti/src/main/java/xerca/xercaconfetti/client/RenderConfettiBallFactory.java
import org.jetbrains.annotations.NotNull;
import xerca.xercaconfetti.entity.EntityConfettiBall;
========
import net.minecraft.client.renderer.entity.state.ThrownItemRenderState;
import xerca.xercatools.entity.EntityConfettiBall;
>>>>>>>> upstream/fabric-1.21.11:XercaTools/src/main/java/xerca/xercatools/client/RenderConfettiBallFactory.java

public class RenderConfettiBallFactory implements EntityRendererProvider<EntityConfettiBall> {

    @Override
<<<<<<<< HEAD:XercaConfetti/src/main/java/xerca/xercaconfetti/client/RenderConfettiBallFactory.java
    public @NotNull EntityRenderer<EntityConfettiBall> create(@NotNull Context ctx) {
========
    public EntityRenderer<EntityConfettiBall, ThrownItemRenderState> create(Context ctx) {
>>>>>>>> upstream/fabric-1.21.11:XercaTools/src/main/java/xerca/xercatools/client/RenderConfettiBallFactory.java
        return new ThrownItemRenderer<>(ctx);
    }
}
