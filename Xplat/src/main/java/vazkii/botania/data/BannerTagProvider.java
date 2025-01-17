package vazkii.botania.data;

import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BannerPatternTags;
import net.minecraft.world.level.block.entity.BannerPattern;

import vazkii.botania.common.lib.BotaniaTags;

import static vazkii.botania.common.block.BotaniaBannerPatterns.*;

public class BannerTagProvider extends TagsProvider<BannerPattern> {
	public BannerTagProvider(DataGenerator generator) {
		super(generator, Registry.BANNER_PATTERN);
	}

	@Override
	protected void addTags() {
		this.tag(BannerPatternTags.NO_ITEM_REQUIRED).add(
				FISH, AXE, HOE, PICKAXE, SHOVEL, SWORD
		);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_LIVINGWOOD_TWIG).add(FLOWER);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_LEXICON).add(LEXICON);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_TERRASTEEL).add(LOGO);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_DREAMWOOD_TWIG).add(SAPLING);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_TINY_POTATO).add(TINY_POTATO);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_SPARK_DISPERSIVE).add(SPARK_DISPERSIVE);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_SPARK_DOMINANT).add(SPARK_DOMINANT);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_SPARK_RECESSIVE).add(SPARK_RECESSIVE);
		this.tag(BotaniaTags.BannerPatterns.PATTERN_ITEM_SPARK_ISOLATED).add(SPARK_ISOLATED);
	}
}
