package br.com.nexus.plugin.api;

import br.com.nexus.plugin.cache.CacheBungee;
import br.com.nexus.plugin.object.TagModel;
import br.com.nexus.plugin.util.TagUtil;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class VeantyCoreAPI {

    public TagModel getTagUtil(ProxiedPlayer proxiedPlayer) {
        for(TagModel tagModel : CacheBungee.tagModelArrayList) {
            if (proxiedPlayer.hasPermission(tagModel.getPermission())) {
                return tagModel;
            }
        }
        return new TagModel("§7", "Z", "tag.default");
    }

}
