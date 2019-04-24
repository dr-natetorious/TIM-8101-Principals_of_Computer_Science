class android.support.design.widget.p {
  static android.graphics.PorterDuff$Mode a(int, android.graphics.PorterDuff$Mode);
    Code:
       0: iload_0
       1: iconst_3
       2: if_icmpeq     58
       5: iload_0
       6: iconst_5
       7: if_icmpeq     54
      10: iload_0
      11: bipush        9
      13: if_icmpeq     50
      16: iload_0
      17: tableswitch   { // 14 to 15
                    14: 46
                    15: 42
               default: 40
          }
      40: aload_1
      41: areturn
      42: getstatic     #12                 // Field android/graphics/PorterDuff$Mode.SCREEN:Landroid/graphics/PorterDuff$Mode;
      45: areturn
      46: getstatic     #15                 // Field android/graphics/PorterDuff$Mode.MULTIPLY:Landroid/graphics/PorterDuff$Mode;
      49: areturn
      50: getstatic     #18                 // Field android/graphics/PorterDuff$Mode.SRC_ATOP:Landroid/graphics/PorterDuff$Mode;
      53: areturn
      54: getstatic     #21                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      57: areturn
      58: getstatic     #24                 // Field android/graphics/PorterDuff$Mode.SRC_OVER:Landroid/graphics/PorterDuff$Mode;
      61: areturn
}
