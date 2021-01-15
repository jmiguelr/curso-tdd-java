package com.gildedrose;

class GildedRose {

  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      processItem(item);
    }
  }

  private void processItem(Item item) {
    if (!item.name.equals("Aged Brie") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
      //
      decrease2(item);
      //
    } else {
      increaseQuality(item);
      if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.sellIn < 11) {
          increaseQuality(item);
        }
        if (item.sellIn < 6) {
          increaseQuality(item);
        }
      }
    }

    decreaseSellIn(item);

    if (item.sellIn < 0) {
      if (!item.name.equals("Aged Brie")) {
        if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          //
          decrease2(item);
          //
        } else {
          item.quality = 0;
        }
      } else {
        increaseQuality(item);
      }
    }
  }

  private void decrease2(Item item) {
    if (item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
      item.quality = item.quality - 1;
    }
  }

  private void decreaseSellIn(Item item) {
    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
      item.sellIn = item.sellIn - 1;
    }
  }

  public void increaseQuality(Item item) {
    if (item.quality < 50) {
      item.quality = item.quality + 1;
    }
  }
}
