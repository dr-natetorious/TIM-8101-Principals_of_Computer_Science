public class android.support.v7.widget.bm extends android.content.ContextWrapper {
  static {};
    Code:
       0: new           #17                 // class java/lang/Object
       3: dup
       4: invokespecial #20                 // Method java/lang/Object."<init>":()V
       7: putstatic     #22                 // Field a:Ljava/lang/Object;
      10: return

  public static android.content.Context a(android.content.Context);
    Code:
       0: aload_0
       1: invokestatic  #66                 // Method b:(Landroid/content/Context;)Z
       4: ifeq          166
       7: getstatic     #22                 // Field a:Ljava/lang/Object;
      10: astore_3
      11: aload_3
      12: monitorenter
      13: getstatic     #68                 // Field b:Ljava/util/ArrayList;
      16: ifnonnull     32
      19: new           #70                 // class java/util/ArrayList
      22: dup
      23: invokespecial #71                 // Method java/util/ArrayList."<init>":()V
      26: putstatic     #68                 // Field b:Ljava/util/ArrayList;
      29: goto          133
      32: getstatic     #68                 // Field b:Ljava/util/ArrayList;
      35: invokevirtual #75                 // Method java/util/ArrayList.size:()I
      38: iconst_1
      39: isub
      40: istore_1
      41: iload_1
      42: iflt          78
      45: getstatic     #68                 // Field b:Ljava/util/ArrayList;
      48: iload_1
      49: invokevirtual #79                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      52: checkcast     #81                 // class java/lang/ref/WeakReference
      55: astore_2
      56: aload_2
      57: ifnull        67
      60: aload_2
      61: invokevirtual #84                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      64: ifnonnull     168
      67: getstatic     #68                 // Field b:Ljava/util/ArrayList;
      70: iload_1
      71: invokevirtual #87                 // Method java/util/ArrayList.remove:(I)Ljava/lang/Object;
      74: pop
      75: goto          168
      78: getstatic     #68                 // Field b:Ljava/util/ArrayList;
      81: invokevirtual #75                 // Method java/util/ArrayList.size:()I
      84: iconst_1
      85: isub
      86: istore_1
      87: iload_1
      88: iflt          133
      91: getstatic     #68                 // Field b:Ljava/util/ArrayList;
      94: iload_1
      95: invokevirtual #79                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      98: checkcast     #81                 // class java/lang/ref/WeakReference
     101: astore_2
     102: aload_2
     103: ifnull        175
     106: aload_2
     107: invokevirtual #84                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     110: checkcast     #2                  // class android/support/v7/widget/bm
     113: astore_2
     114: goto          117
     117: aload_2
     118: ifnull        180
     121: aload_2
     122: invokevirtual #91                 // Method getBaseContext:()Landroid/content/Context;
     125: aload_0
     126: if_acmpne     180
     129: aload_3
     130: monitorexit
     131: aload_2
     132: areturn
     133: new           #2                  // class android/support/v7/widget/bm
     136: dup
     137: aload_0
     138: invokespecial #92                 // Method "<init>":(Landroid/content/Context;)V
     141: astore_0
     142: getstatic     #68                 // Field b:Ljava/util/ArrayList;
     145: new           #81                 // class java/lang/ref/WeakReference
     148: dup
     149: aload_0
     150: invokespecial #95                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
     153: invokevirtual #99                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     156: pop
     157: aload_3
     158: monitorexit
     159: aload_0
     160: areturn
     161: astore_0
     162: aload_3
     163: monitorexit
     164: aload_0
     165: athrow
     166: aload_0
     167: areturn
     168: iload_1
     169: iconst_1
     170: isub
     171: istore_1
     172: goto          41
     175: aconst_null
     176: astore_2
     177: goto          117
     180: iload_1
     181: iconst_1
     182: isub
     183: istore_1
     184: goto          87
    Exception table:
       from    to  target type
          13    29   161   any
          32    41   161   any
          45    56   161   any
          60    67   161   any
          67    75   161   any
          78    87   161   any
          91   102   161   any
         106   114   161   any
         121   131   161   any
         133   159   161   any
         162   164   161   any

  public android.content.res.AssetManager getAssets();
    Code:
       0: aload_0
       1: getfield      #42                 // Field c:Landroid/content/res/Resources;
       4: invokevirtual #109                // Method android/content/res/Resources.getAssets:()Landroid/content/res/AssetManager;
       7: areturn

  public android.content.res.Resources getResources();
    Code:
       0: aload_0
       1: getfield      #42                 // Field c:Landroid/content/res/Resources;
       4: areturn

  public android.content.res.Resources$Theme getTheme();
    Code:
       0: aload_0
       1: getfield      #50                 // Field d:Landroid/content/res/Resources$Theme;
       4: ifnonnull     12
       7: aload_0
       8: invokespecial #110                // Method android/content/ContextWrapper.getTheme:()Landroid/content/res/Resources$Theme;
      11: areturn
      12: aload_0
      13: getfield      #50                 // Field d:Landroid/content/res/Resources$Theme;
      16: areturn

  public void setTheme(int);
    Code:
       0: aload_0
       1: getfield      #50                 // Field d:Landroid/content/res/Resources$Theme;
       4: ifnonnull     13
       7: aload_0
       8: iload_1
       9: invokespecial #114                // Method android/content/ContextWrapper.setTheme:(I)V
      12: return
      13: aload_0
      14: getfield      #50                 // Field d:Landroid/content/res/Resources$Theme;
      17: iload_1
      18: iconst_1
      19: invokevirtual #118                // Method android/content/res/Resources$Theme.applyStyle:(IZ)V
      22: return
}
