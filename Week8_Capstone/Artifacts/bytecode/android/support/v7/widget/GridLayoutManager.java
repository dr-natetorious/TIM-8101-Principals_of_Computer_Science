public class android.support.v7.widget.GridLayoutManager extends android.support.v7.widget.LinearLayoutManager {
  boolean a;

  int b;

  int[] c;

  android.view.View[] d;

  final android.util.SparseIntArray e;

  final android.util.SparseIntArray f;

  android.support.v7.widget.GridLayoutManager$c g;

  final android.graphics.Rect h;

  public android.support.v7.widget.GridLayoutManager(android.content.Context, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #30                 // Method android/support/v7/widget/LinearLayoutManager."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: iconst_0
       7: putfield      #32                 // Field a:Z
      10: aload_0
      11: iconst_m1
      12: putfield      #34                 // Field b:I
      15: aload_0
      16: new           #36                 // class android/util/SparseIntArray
      19: dup
      20: invokespecial #39                 // Method android/util/SparseIntArray."<init>":()V
      23: putfield      #41                 // Field e:Landroid/util/SparseIntArray;
      26: aload_0
      27: new           #36                 // class android/util/SparseIntArray
      30: dup
      31: invokespecial #39                 // Method android/util/SparseIntArray."<init>":()V
      34: putfield      #43                 // Field f:Landroid/util/SparseIntArray;
      37: aload_0
      38: new           #6                  // class android/support/v7/widget/GridLayoutManager$a
      41: dup
      42: invokespecial #44                 // Method android/support/v7/widget/GridLayoutManager$a."<init>":()V
      45: putfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
      48: aload_0
      49: new           #48                 // class android/graphics/Rect
      52: dup
      53: invokespecial #49                 // Method android/graphics/Rect."<init>":()V
      56: putfield      #51                 // Field h:Landroid/graphics/Rect;
      59: aload_0
      60: iload_2
      61: invokevirtual #54                 // Method a:(I)V
      64: return

  public android.support.v7.widget.GridLayoutManager(android.content.Context, int, int, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_3
       3: iload         4
       5: invokespecial #59                 // Method android/support/v7/widget/LinearLayoutManager."<init>":(Landroid/content/Context;IZ)V
       8: aload_0
       9: iconst_0
      10: putfield      #32                 // Field a:Z
      13: aload_0
      14: iconst_m1
      15: putfield      #34                 // Field b:I
      18: aload_0
      19: new           #36                 // class android/util/SparseIntArray
      22: dup
      23: invokespecial #39                 // Method android/util/SparseIntArray."<init>":()V
      26: putfield      #41                 // Field e:Landroid/util/SparseIntArray;
      29: aload_0
      30: new           #36                 // class android/util/SparseIntArray
      33: dup
      34: invokespecial #39                 // Method android/util/SparseIntArray."<init>":()V
      37: putfield      #43                 // Field f:Landroid/util/SparseIntArray;
      40: aload_0
      41: new           #6                  // class android/support/v7/widget/GridLayoutManager$a
      44: dup
      45: invokespecial #44                 // Method android/support/v7/widget/GridLayoutManager$a."<init>":()V
      48: putfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
      51: aload_0
      52: new           #48                 // class android/graphics/Rect
      55: dup
      56: invokespecial #49                 // Method android/graphics/Rect."<init>":()V
      59: putfield      #51                 // Field h:Landroid/graphics/Rect;
      62: aload_0
      63: iload_2
      64: invokevirtual #54                 // Method a:(I)V
      67: return

  public android.support.v7.widget.GridLayoutManager(android.content.Context, android.util.AttributeSet, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #62                 // Method android/support/v7/widget/LinearLayoutManager."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;II)V
       9: aload_0
      10: iconst_0
      11: putfield      #32                 // Field a:Z
      14: aload_0
      15: iconst_m1
      16: putfield      #34                 // Field b:I
      19: aload_0
      20: new           #36                 // class android/util/SparseIntArray
      23: dup
      24: invokespecial #39                 // Method android/util/SparseIntArray."<init>":()V
      27: putfield      #41                 // Field e:Landroid/util/SparseIntArray;
      30: aload_0
      31: new           #36                 // class android/util/SparseIntArray
      34: dup
      35: invokespecial #39                 // Method android/util/SparseIntArray."<init>":()V
      38: putfield      #43                 // Field f:Landroid/util/SparseIntArray;
      41: aload_0
      42: new           #6                  // class android/support/v7/widget/GridLayoutManager$a
      45: dup
      46: invokespecial #44                 // Method android/support/v7/widget/GridLayoutManager$a."<init>":()V
      49: putfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
      52: aload_0
      53: new           #48                 // class android/graphics/Rect
      56: dup
      57: invokespecial #49                 // Method android/graphics/Rect."<init>":()V
      60: putfield      #51                 // Field h:Landroid/graphics/Rect;
      63: aload_0
      64: aload_1
      65: aload_2
      66: iload_3
      67: iload         4
      69: invokestatic  #65                 // Method a:(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/support/v7/widget/RecyclerView$i$b;
      72: getfield      #68                 // Field android/support/v7/widget/RecyclerView$i$b.b:I
      75: invokevirtual #54                 // Method a:(I)V
      78: return

  static int[] a(int[], int, int);
    Code:
       0: iconst_1
       1: istore        4
       3: aload_0
       4: ifnull        28
       7: aload_0
       8: arraylength
       9: iload_1
      10: iconst_1
      11: iadd
      12: if_icmpne     28
      15: aload_0
      16: astore        8
      18: aload_0
      19: aload_0
      20: arraylength
      21: iconst_1
      22: isub
      23: iaload
      24: iload_2
      25: if_icmpeq     35
      28: iload_1
      29: iconst_1
      30: iadd
      31: newarray       int
      33: astore        8
      35: iconst_0
      36: istore        5
      38: aload         8
      40: iconst_0
      41: iconst_0
      42: iastore
      43: iload_2
      44: iload_1
      45: idiv
      46: istore        6
      48: iload_2
      49: iload_1
      50: irem
      51: istore        7
      53: iconst_0
      54: istore_3
      55: iload         5
      57: istore_2
      58: iload         4
      60: iload_1
      61: if_icmpgt     118
      64: iload_2
      65: iload         7
      67: iadd
      68: istore_2
      69: iload_2
      70: ifle          94
      73: iload_1
      74: iload_2
      75: isub
      76: iload         7
      78: if_icmpge     94
      81: iload         6
      83: iconst_1
      84: iadd
      85: istore        5
      87: iload_2
      88: iload_1
      89: isub
      90: istore_2
      91: goto          98
      94: iload         6
      96: istore        5
      98: iload_3
      99: iload         5
     101: iadd
     102: istore_3
     103: aload         8
     105: iload         4
     107: iload_3
     108: iastore
     109: iload         4
     111: iconst_1
     112: iadd
     113: istore        4
     115: goto          58
     118: aload         8
     120: areturn

  int a(int, int);
    Code:
       0: aload_0
       1: getfield      #223                // Field i:I
       4: iconst_1
       5: if_icmpne     41
       8: aload_0
       9: invokevirtual #270                // Method h:()Z
      12: ifeq          41
      15: aload_0
      16: getfield      #266                // Field c:[I
      19: aload_0
      20: getfield      #34                 // Field b:I
      23: iload_1
      24: isub
      25: iaload
      26: aload_0
      27: getfield      #266                // Field c:[I
      30: aload_0
      31: getfield      #34                 // Field b:I
      34: iload_1
      35: isub
      36: iload_2
      37: isub
      38: iaload
      39: isub
      40: ireturn
      41: aload_0
      42: getfield      #266                // Field c:[I
      45: iload_2
      46: iload_1
      47: iadd
      48: iaload
      49: aload_0
      50: getfield      #266                // Field c:[I
      53: iload_1
      54: iaload
      55: isub
      56: ireturn

  public int a(int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: invokespecial #273                // Method M:()V
       4: aload_0
       5: invokespecial #275                // Method N:()V
       8: aload_0
       9: iload_1
      10: aload_2
      11: aload_3
      12: invokespecial #277                // Method android/support/v7/widget/LinearLayoutManager.a:(ILandroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)I
      15: ireturn

  public int a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #223                // Field i:I
       4: ifne          12
       7: aload_0
       8: getfield      #34                 // Field b:I
      11: ireturn
      12: aload_2
      13: invokevirtual #262                // Method android/support/v7/widget/RecyclerView$u.e:()I
      16: iconst_1
      17: if_icmpge     22
      20: iconst_0
      21: ireturn
      22: aload_0
      23: aload_1
      24: aload_2
      25: aload_2
      26: invokevirtual #262                // Method android/support/v7/widget/RecyclerView$u.e:()I
      29: iconst_1
      30: isub
      31: invokespecial #280                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
      34: iconst_1
      35: iadd
      36: ireturn

  public android.support.v7.widget.RecyclerView$j a();
    Code:
       0: aload_0
       1: getfield      #223                // Field i:I
       4: ifne          18
       7: new           #9                  // class android/support/v7/widget/GridLayoutManager$b
      10: dup
      11: bipush        -2
      13: iconst_m1
      14: invokespecial #283                // Method android/support/v7/widget/GridLayoutManager$b."<init>":(II)V
      17: areturn
      18: new           #9                  // class android/support/v7/widget/GridLayoutManager$b
      21: dup
      22: iconst_m1
      23: bipush        -2
      25: invokespecial #283                // Method android/support/v7/widget/GridLayoutManager$b."<init>":(II)V
      28: areturn

  public android.support.v7.widget.RecyclerView$j a(android.content.Context, android.util.AttributeSet);
    Code:
       0: new           #9                  // class android/support/v7/widget/GridLayoutManager$b
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #287                // Method android/support/v7/widget/GridLayoutManager$b."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       9: areturn

  public android.support.v7.widget.RecyclerView$j a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #290                // class android/view/ViewGroup$MarginLayoutParams
       4: ifeq          19
       7: new           #9                  // class android/support/v7/widget/GridLayoutManager$b
      10: dup
      11: aload_1
      12: checkcast     #290                // class android/view/ViewGroup$MarginLayoutParams
      15: invokespecial #293                // Method android/support/v7/widget/GridLayoutManager$b."<init>":(Landroid/view/ViewGroup$MarginLayoutParams;)V
      18: areturn
      19: new           #9                  // class android/support/v7/widget/GridLayoutManager$b
      22: dup
      23: aload_1
      24: invokespecial #296                // Method android/support/v7/widget/GridLayoutManager$b."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
      27: areturn

  android.view.View a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, int, int, int);
    Code:
       0: aload_0
       1: invokevirtual #299                // Method i:()V
       4: aload_0
       5: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
       8: invokevirtual #301                // Method android/support/v7/widget/ba.c:()I
      11: istore        7
      13: aload_0
      14: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
      17: invokevirtual #303                // Method android/support/v7/widget/ba.d:()I
      20: istore        8
      22: iload         4
      24: iload_3
      25: if_icmple     34
      28: iconst_1
      29: istore        6
      31: goto          37
      34: iconst_m1
      35: istore        6
      37: aconst_null
      38: astore        11
      40: aconst_null
      41: astore        10
      43: iload_3
      44: iload         4
      46: if_icmpeq     223
      49: aload_0
      50: iload_3
      51: invokevirtual #80                 // Method h:(I)Landroid/view/View;
      54: astore        14
      56: aload_0
      57: aload         14
      59: invokevirtual #175                // Method d:(Landroid/view/View;)I
      62: istore        9
      64: aload         11
      66: astore        12
      68: aload         10
      70: astore        13
      72: iload         9
      74: iflt          207
      77: aload         11
      79: astore        12
      81: aload         10
      83: astore        13
      85: iload         9
      87: iload         5
      89: if_icmpge     207
      92: aload_0
      93: aload_1
      94: aload_2
      95: iload         9
      97: invokespecial #260                // Method b:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
     100: ifeq          114
     103: aload         11
     105: astore        12
     107: aload         10
     109: astore        13
     111: goto          207
     114: aload         14
     116: invokevirtual #86                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     119: checkcast     #183                // class android/support/v7/widget/RecyclerView$j
     122: invokevirtual #305                // Method android/support/v7/widget/RecyclerView$j.d:()Z
     125: ifeq          152
     128: aload         11
     130: astore        12
     132: aload         10
     134: astore        13
     136: aload         10
     138: ifnonnull     207
     141: aload         14
     143: astore        13
     145: aload         11
     147: astore        12
     149: goto          207
     152: aload_0
     153: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
     156: aload         14
     158: invokevirtual #307                // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
     161: iload         8
     163: if_icmpge     186
     166: aload_0
     167: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
     170: aload         14
     172: invokevirtual #309                // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
     175: iload         7
     177: if_icmpge     183
     180: goto          186
     183: aload         14
     185: areturn
     186: aload         11
     188: astore        12
     190: aload         10
     192: astore        13
     194: aload         11
     196: ifnonnull     207
     199: aload         14
     201: astore        12
     203: aload         10
     205: astore        13
     207: iload_3
     208: iload         6
     210: iadd
     211: istore_3
     212: aload         12
     214: astore        11
     216: aload         13
     218: astore        10
     220: goto          43
     223: aload         11
     225: ifnull        231
     228: aload         11
     230: areturn
     231: aload         10
     233: areturn

  public android.view.View a(android.view.View, int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #313                // Method e:(Landroid/view/View;)Landroid/view/View;
       5: astore        22
       7: aconst_null
       8: astore        21
      10: aload         22
      12: ifnonnull     17
      15: aconst_null
      16: areturn
      17: aload         22
      19: invokevirtual #86                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      22: checkcast     #9                  // class android/support/v7/widget/GridLayoutManager$b
      25: astore        23
      27: aload         23
      29: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
      32: istore        14
      34: aload         23
      36: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
      39: aload         23
      41: getfield      #178                // Field android/support/v7/widget/GridLayoutManager$b.b:I
      44: iadd
      45: istore        15
      47: aload_0
      48: aload_1
      49: iload_2
      50: aload_3
      51: aload         4
      53: invokespecial #315                // Method android/support/v7/widget/LinearLayoutManager.a:(Landroid/view/View;ILandroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)Landroid/view/View;
      56: ifnonnull     61
      59: aconst_null
      60: areturn
      61: aload_0
      62: iload_2
      63: invokevirtual #317                // Method e:(I)I
      66: iconst_1
      67: if_icmpne     76
      70: iconst_1
      71: istore        20
      73: goto          79
      76: iconst_0
      77: istore        20
      79: iload         20
      81: aload_0
      82: getfield      #320                // Field k:Z
      85: if_icmpeq     93
      88: iconst_1
      89: istore_2
      90: goto          95
      93: iconst_0
      94: istore_2
      95: iload_2
      96: ifeq          116
      99: aload_0
     100: invokevirtual #77                 // Method v:()I
     103: iconst_1
     104: isub
     105: istore        7
     107: iconst_m1
     108: istore        5
     110: iconst_m1
     111: istore        8
     113: goto          128
     116: aload_0
     117: invokevirtual #77                 // Method v:()I
     120: istore        5
     122: iconst_0
     123: istore        7
     125: iconst_1
     126: istore        8
     128: aload_0
     129: getfield      #223                // Field i:I
     132: iconst_1
     133: if_icmpne     149
     136: aload_0
     137: invokevirtual #270                // Method h:()Z
     140: ifeq          149
     143: iconst_1
     144: istore        9
     146: goto          152
     149: iconst_0
     150: istore        9
     152: aload_0
     153: aload_3
     154: aload         4
     156: iload         7
     158: invokespecial #280                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
     161: istore        16
     163: aconst_null
     164: astore_1
     165: iconst_m1
     166: istore        12
     168: iconst_0
     169: istore        11
     171: iconst_0
     172: istore_2
     173: iconst_m1
     174: istore        6
     176: iload         5
     178: istore        10
     180: iload         12
     182: istore        5
     184: iload         7
     186: iload         10
     188: if_icmpeq     555
     191: aload_0
     192: aload_3
     193: aload         4
     195: iload         7
     197: invokespecial #280                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
     200: istore        12
     202: aload_0
     203: iload         7
     205: invokevirtual #80                 // Method h:(I)Landroid/view/View;
     208: astore        23
     210: aload         23
     212: aload         22
     214: if_acmpne     220
     217: goto          555
     220: aload         23
     222: invokevirtual #323                // Method android/view/View.hasFocusable:()Z
     225: ifeq          246
     228: iload         12
     230: iload         16
     232: if_icmpeq     246
     235: aload         21
     237: ifnull        243
     240: goto          555
     243: goto          545
     246: aload         23
     248: invokevirtual #86                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     251: checkcast     #9                  // class android/support/v7/widget/GridLayoutManager$b
     254: astore        24
     256: aload         24
     258: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
     261: istore        17
     263: aload         24
     265: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
     268: aload         24
     270: getfield      #178                // Field android/support/v7/widget/GridLayoutManager$b.b:I
     273: iadd
     274: istore        18
     276: aload         23
     278: invokevirtual #323                // Method android/view/View.hasFocusable:()Z
     281: ifeq          301
     284: iload         17
     286: iload         14
     288: if_icmpne     301
     291: iload         18
     293: iload         15
     295: if_icmpne     301
     298: aload         23
     300: areturn
     301: aload         23
     303: invokevirtual #323                // Method android/view/View.hasFocusable:()Z
     306: ifeq          314
     309: aload         21
     311: ifnull        326
     314: aload         23
     316: invokevirtual #323                // Method android/view/View.hasFocusable:()Z
     319: ifne          332
     322: aload_1
     323: ifnonnull     332
     326: iconst_1
     327: istore        12
     329: goto          466
     332: iload         17
     334: iload         14
     336: invokestatic  #171                // Method java/lang/Math.max:(II)I
     339: istore        12
     341: iload         18
     343: iload         15
     345: invokestatic  #326                // Method java/lang/Math.min:(II)I
     348: iload         12
     350: isub
     351: istore        19
     353: aload         23
     355: invokevirtual #323                // Method android/view/View.hasFocusable:()Z
     358: ifeq          404
     361: iload         19
     363: iload         11
     365: if_icmple     371
     368: goto          326
     371: iload         19
     373: iload         11
     375: if_icmpne     463
     378: iload         17
     380: iload         5
     382: if_icmple     391
     385: iconst_1
     386: istore        12
     388: goto          394
     391: iconst_0
     392: istore        12
     394: iload         9
     396: iload         12
     398: if_icmpne     463
     401: goto          326
     404: aload         21
     406: ifnonnull     463
     409: iconst_0
     410: istore        12
     412: aload_0
     413: aload         23
     415: iconst_0
     416: iconst_1
     417: invokevirtual #329                // Method a:(Landroid/view/View;ZZ)Z
     420: ifeq          463
     423: iload_2
     424: istore        13
     426: iload         19
     428: iload         13
     430: if_icmple     436
     433: goto          326
     436: iload         19
     438: iload         13
     440: if_icmpne     463
     443: iload         17
     445: iload         6
     447: if_icmple     453
     450: iconst_1
     451: istore        12
     453: iload         9
     455: iload         12
     457: if_icmpne     463
     460: goto          326
     463: iconst_0
     464: istore        12
     466: iload         12
     468: ifeq          545
     471: aload         23
     473: invokevirtual #323                // Method android/view/View.hasFocusable:()Z
     476: ifeq          510
     479: aload         24
     481: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
     484: istore        5
     486: iload         18
     488: iload         15
     490: invokestatic  #326                // Method java/lang/Math.min:(II)I
     493: iload         17
     495: iload         14
     497: invokestatic  #171                // Method java/lang/Math.max:(II)I
     500: isub
     501: istore        11
     503: aload         23
     505: astore        21
     507: goto          545
     510: aload         24
     512: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
     515: istore        6
     517: iload         18
     519: iload         15
     521: invokestatic  #326                // Method java/lang/Math.min:(II)I
     524: istore_2
     525: iload         17
     527: iload         14
     529: invokestatic  #171                // Method java/lang/Math.max:(II)I
     532: istore        12
     534: aload         23
     536: astore_1
     537: iload_2
     538: iload         12
     540: isub
     541: istore_2
     542: goto          545
     545: iload         7
     547: iload         8
     549: iadd
     550: istore        7
     552: goto          184
     555: aload         21
     557: ifnull        563
     560: aload         21
     562: astore_1
     563: aload_1
     564: areturn

  public void a(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #34                 // Field b:I
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iconst_1
      11: putfield      #32                 // Field a:Z
      14: iload_1
      15: iconst_1
      16: if_icmpge     53
      19: new           #139                // class java/lang/StringBuilder
      22: dup
      23: invokespecial #140                // Method java/lang/StringBuilder."<init>":()V
      26: astore_2
      27: aload_2
      28: ldc_w         #331                // String Span count should be at least 1. Provided
      31: invokevirtual #146                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: aload_2
      36: iload_1
      37: invokevirtual #149                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      40: pop
      41: new           #333                // class java/lang/IllegalArgumentException
      44: dup
      45: aload_2
      46: invokevirtual #155                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      49: invokespecial #336                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      52: athrow
      53: aload_0
      54: iload_1
      55: putfield      #34                 // Field b:I
      58: aload_0
      59: getfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
      62: invokevirtual #338                // Method android/support/v7/widget/GridLayoutManager$c.a:()V
      65: aload_0
      66: invokevirtual #341                // Method o:()V
      69: return

  public void a(android.graphics.Rect, int, int);
    Code:
       0: aload_0
       1: getfield      #266                // Field c:[I
       4: ifnonnull     14
       7: aload_0
       8: aload_1
       9: iload_2
      10: iload_3
      11: invokespecial #344                // Method android/support/v7/widget/LinearLayoutManager.a:(Landroid/graphics/Rect;II)V
      14: aload_0
      15: invokevirtual #108                // Method A:()I
      18: aload_0
      19: invokevirtual #105                // Method C:()I
      22: iadd
      23: istore        4
      25: aload_0
      26: invokevirtual #117                // Method B:()I
      29: aload_0
      30: invokevirtual #114                // Method D:()I
      33: iadd
      34: istore        5
      36: aload_0
      37: getfield      #223                // Field i:I
      40: iconst_1
      41: if_icmpne     93
      44: iload_3
      45: aload_1
      46: invokevirtual #346                // Method android/graphics/Rect.height:()I
      49: iload         5
      51: iadd
      52: aload_0
      53: invokevirtual #349                // Method G:()I
      56: invokestatic  #352                // Method a:(III)I
      59: istore_3
      60: iload_2
      61: aload_0
      62: getfield      #266                // Field c:[I
      65: aload_0
      66: getfield      #266                // Field c:[I
      69: arraylength
      70: iconst_1
      71: isub
      72: iaload
      73: iload         4
      75: iadd
      76: aload_0
      77: invokevirtual #355                // Method F:()I
      80: invokestatic  #352                // Method a:(III)I
      83: istore        4
      85: iload_3
      86: istore_2
      87: iload         4
      89: istore_3
      90: goto          139
      93: iload_2
      94: aload_1
      95: invokevirtual #357                // Method android/graphics/Rect.width:()I
      98: iload         4
     100: iadd
     101: aload_0
     102: invokevirtual #355                // Method F:()I
     105: invokestatic  #352                // Method a:(III)I
     108: istore_2
     109: iload_3
     110: aload_0
     111: getfield      #266                // Field c:[I
     114: aload_0
     115: getfield      #266                // Field c:[I
     118: arraylength
     119: iconst_1
     120: isub
     121: iaload
     122: iload         5
     124: iadd
     125: aload_0
     126: invokevirtual #349                // Method G:()I
     129: invokestatic  #352                // Method a:(III)I
     132: istore        4
     134: iload_2
     135: istore_3
     136: iload         4
     138: istore_2
     139: aload_0
     140: iload_3
     141: iload_2
     142: invokevirtual #359                // Method f:(II)V
     145: return

  void a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, android.support.v7.widget.LinearLayoutManager$a, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: iload         4
       6: invokespecial #361                // Method android/support/v7/widget/LinearLayoutManager.a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;Landroid/support/v7/widget/LinearLayoutManager$a;I)V
       9: aload_0
      10: invokespecial #273                // Method M:()V
      13: aload_2
      14: invokevirtual #262                // Method android/support/v7/widget/RecyclerView$u.e:()I
      17: ifle          36
      20: aload_2
      21: invokevirtual #129                // Method android/support/v7/widget/RecyclerView$u.a:()Z
      24: ifne          36
      27: aload_0
      28: aload_1
      29: aload_2
      30: aload_3
      31: iload         4
      33: invokespecial #363                // Method b:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;Landroid/support/v7/widget/LinearLayoutManager$a;I)V
      36: aload_0
      37: invokespecial #275                // Method N:()V
      40: return

  void a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, android.support.v7.widget.LinearLayoutManager$c, android.support.v7.widget.LinearLayoutManager$b);
    Code:
       0: aload_0
       1: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
       4: invokevirtual #366                // Method android/support/v7/widget/ba.i:()I
       7: istore        15
       9: iload         15
      11: ldc_w         #367                // int 1073741824
      14: if_icmpeq     23
      17: iconst_1
      18: istore        10
      20: goto          26
      23: iconst_0
      24: istore        10
      26: aload_0
      27: invokevirtual #77                 // Method v:()I
      30: ifle          47
      33: aload_0
      34: getfield      #266                // Field c:[I
      37: aload_0
      38: getfield      #34                 // Field b:I
      41: iaload
      42: istore        11
      44: goto          50
      47: iconst_0
      48: istore        11
      50: iload         10
      52: ifeq          59
      55: aload_0
      56: invokespecial #273                // Method M:()V
      59: aload_3
      60: getfield      #371                // Field android/support/v7/widget/LinearLayoutManager$c.e:I
      63: iconst_1
      64: if_icmpne     73
      67: iconst_1
      68: istore        16
      70: goto          76
      73: iconst_0
      74: istore        16
      76: aload_0
      77: getfield      #34                 // Field b:I
      80: istore        8
      82: iload         16
      84: ifne          110
      87: aload_0
      88: aload_1
      89: aload_2
      90: aload_3
      91: getfield      #373                // Field android/support/v7/widget/LinearLayoutManager$c.d:I
      94: invokespecial #260                // Method b:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
      97: aload_0
      98: aload_1
      99: aload_2
     100: aload_3
     101: getfield      #373                // Field android/support/v7/widget/LinearLayoutManager$c.d:I
     104: invokespecial #177                // Method c:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
     107: iadd
     108: istore        8
     110: iconst_0
     111: istore        9
     113: iconst_0
     114: istore        12
     116: iload         12
     118: aload_0
     119: getfield      #34                 // Field b:I
     122: if_icmpge     293
     125: aload_3
     126: aload_2
     127: invokevirtual #376                // Method android/support/v7/widget/LinearLayoutManager$c.a:(Landroid/support/v7/widget/RecyclerView$u;)Z
     130: ifeq          293
     133: iload         8
     135: ifle          293
     138: aload_3
     139: getfield      #373                // Field android/support/v7/widget/LinearLayoutManager$c.d:I
     142: istore        14
     144: aload_0
     145: aload_1
     146: aload_2
     147: iload         14
     149: invokespecial #177                // Method c:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
     152: istore        13
     154: iload         13
     156: aload_0
     157: getfield      #34                 // Field b:I
     160: if_icmple     238
     163: new           #139                // class java/lang/StringBuilder
     166: dup
     167: invokespecial #140                // Method java/lang/StringBuilder."<init>":()V
     170: astore_1
     171: aload_1
     172: ldc_w         #378                // String Item at position
     175: invokevirtual #146                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     178: pop
     179: aload_1
     180: iload         14
     182: invokevirtual #149                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     185: pop
     186: aload_1
     187: ldc_w         #380                // String  requires
     190: invokevirtual #146                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     193: pop
     194: aload_1
     195: iload         13
     197: invokevirtual #149                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     200: pop
     201: aload_1
     202: ldc_w         #382                // String  spans but GridLayoutManager has only
     205: invokevirtual #146                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     208: pop
     209: aload_1
     210: aload_0
     211: getfield      #34                 // Field b:I
     214: invokevirtual #149                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     217: pop
     218: aload_1
     219: ldc_w         #384                // String  spans.
     222: invokevirtual #146                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     225: pop
     226: new           #333                // class java/lang/IllegalArgumentException
     229: dup
     230: aload_1
     231: invokevirtual #155                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     234: invokespecial #336                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
     237: athrow
     238: iload         8
     240: iload         13
     242: isub
     243: istore        8
     245: iload         8
     247: ifge          253
     250: goto          293
     253: aload_3
     254: aload_1
     255: invokevirtual #387                // Method android/support/v7/widget/LinearLayoutManager$c.a:(Landroid/support/v7/widget/RecyclerView$p;)Landroid/view/View;
     258: astore        17
     260: aload         17
     262: ifnonnull     268
     265: goto          293
     268: iload         9
     270: iload         13
     272: iadd
     273: istore        9
     275: aload_0
     276: getfield      #123                // Field d:[Landroid/view/View;
     279: iload         12
     281: aload         17
     283: aastore
     284: iload         12
     286: iconst_1
     287: iadd
     288: istore        12
     290: goto          116
     293: iload         12
     295: ifne          305
     298: aload         4
     300: iconst_1
     301: putfield      #391                // Field android/support/v7/widget/LinearLayoutManager$b.b:Z
     304: return
     305: fconst_0
     306: fstore        5
     308: aload_0
     309: aload_1
     310: aload_2
     311: iload         12
     313: iload         9
     315: iload         16
     317: invokespecial #393                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;IIZ)V
     320: iconst_0
     321: istore        9
     323: iconst_0
     324: istore        8
     326: iload         9
     328: iload         12
     330: if_icmpge     491
     333: aload_0
     334: getfield      #123                // Field d:[Landroid/view/View;
     337: iload         9
     339: aaload
     340: astore_1
     341: aload_3
     342: getfield      #396                // Field android/support/v7/widget/LinearLayoutManager$c.k:Ljava/util/List;
     345: ifnonnull     370
     348: iload         16
     350: ifeq          361
     353: aload_0
     354: aload_1
     355: invokevirtual #399                // Method b:(Landroid/view/View;)V
     358: goto          389
     361: aload_0
     362: aload_1
     363: iconst_0
     364: invokevirtual #402                // Method b:(Landroid/view/View;I)V
     367: goto          389
     370: iload         16
     372: ifeq          383
     375: aload_0
     376: aload_1
     377: invokevirtual #404                // Method a:(Landroid/view/View;)V
     380: goto          389
     383: aload_0
     384: aload_1
     385: iconst_0
     386: invokevirtual #406                // Method a:(Landroid/view/View;I)V
     389: aload_0
     390: aload_1
     391: aload_0
     392: getfield      #51                 // Field h:Landroid/graphics/Rect;
     395: invokevirtual #409                // Method b:(Landroid/view/View;Landroid/graphics/Rect;)V
     398: aload_0
     399: aload_1
     400: iload         15
     402: iconst_0
     403: invokespecial #411                // Method a:(Landroid/view/View;IZ)V
     406: aload_0
     407: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
     410: aload_1
     411: invokevirtual #413                // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
     414: istore        14
     416: iload         8
     418: istore        13
     420: iload         14
     422: iload         8
     424: if_icmple     431
     427: iload         14
     429: istore        13
     431: aload_1
     432: invokevirtual #86                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     435: checkcast     #9                  // class android/support/v7/widget/GridLayoutManager$b
     438: astore_2
     439: aload_0
     440: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
     443: aload_1
     444: invokevirtual #415                // Method android/support/v7/widget/ba.f:(Landroid/view/View;)I
     447: i2f
     448: fconst_1
     449: fmul
     450: aload_2
     451: getfield      #178                // Field android/support/v7/widget/GridLayoutManager$b.b:I
     454: i2f
     455: fdiv
     456: fstore        7
     458: fload         5
     460: fstore        6
     462: fload         7
     464: fload         5
     466: fcmpl
     467: ifle          474
     470: fload         7
     472: fstore        6
     474: iload         9
     476: iconst_1
     477: iadd
     478: istore        9
     480: iload         13
     482: istore        8
     484: fload         6
     486: fstore        5
     488: goto          326
     491: iload         8
     493: istore        9
     495: iload         10
     497: ifeq          580
     500: aload_0
     501: fload         5
     503: iload         11
     505: invokespecial #417                // Method a:(FI)V
     508: iconst_0
     509: istore        10
     511: iconst_0
     512: istore        8
     514: iload         8
     516: istore        9
     518: iload         10
     520: iload         12
     522: if_icmpge     580
     525: aload_0
     526: getfield      #123                // Field d:[Landroid/view/View;
     529: iload         10
     531: aaload
     532: astore_1
     533: aload_0
     534: aload_1
     535: ldc_w         #367                // int 1073741824
     538: iconst_1
     539: invokespecial #411                // Method a:(Landroid/view/View;IZ)V
     542: aload_0
     543: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
     546: aload_1
     547: invokevirtual #413                // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
     550: istore        11
     552: iload         8
     554: istore        9
     556: iload         11
     558: iload         8
     560: if_icmple     567
     563: iload         11
     565: istore        9
     567: iload         10
     569: iconst_1
     570: iadd
     571: istore        10
     573: iload         9
     575: istore        8
     577: goto          514
     580: iconst_0
     581: istore        8
     583: iload         8
     585: iload         12
     587: if_icmpge     778
     590: aload_0
     591: getfield      #123                // Field d:[Landroid/view/View;
     594: iload         8
     596: aaload
     597: astore_1
     598: aload_0
     599: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
     602: aload_1
     603: invokevirtual #413                // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
     606: iload         9
     608: if_icmpeq     769
     611: aload_1
     612: invokevirtual #86                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     615: checkcast     #9                  // class android/support/v7/widget/GridLayoutManager$b
     618: astore_2
     619: aload_2
     620: getfield      #194                // Field android/support/v7/widget/GridLayoutManager$b.d:Landroid/graphics/Rect;
     623: astore        17
     625: aload         17
     627: getfield      #197                // Field android/graphics/Rect.top:I
     630: aload         17
     632: getfield      #200                // Field android/graphics/Rect.bottom:I
     635: iadd
     636: aload_2
     637: getfield      #203                // Field android/support/v7/widget/GridLayoutManager$b.topMargin:I
     640: iadd
     641: aload_2
     642: getfield      #206                // Field android/support/v7/widget/GridLayoutManager$b.bottomMargin:I
     645: iadd
     646: istore        11
     648: aload         17
     650: getfield      #209                // Field android/graphics/Rect.left:I
     653: aload         17
     655: getfield      #212                // Field android/graphics/Rect.right:I
     658: iadd
     659: aload_2
     660: getfield      #215                // Field android/support/v7/widget/GridLayoutManager$b.leftMargin:I
     663: iadd
     664: aload_2
     665: getfield      #218                // Field android/support/v7/widget/GridLayoutManager$b.rightMargin:I
     668: iadd
     669: istore        10
     671: aload_0
     672: aload_2
     673: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
     676: aload_2
     677: getfield      #178                // Field android/support/v7/widget/GridLayoutManager$b.b:I
     680: invokevirtual #220                // Method a:(II)I
     683: istore        13
     685: aload_0
     686: getfield      #223                // Field i:I
     689: iconst_1
     690: if_icmpne     726
     693: iload         13
     695: ldc_w         #367                // int 1073741824
     698: iload         10
     700: aload_2
     701: getfield      #226                // Field android/support/v7/widget/GridLayoutManager$b.width:I
     704: iconst_0
     705: invokestatic  #229                // Method a:(IIIIZ)I
     708: istore        10
     710: iload         9
     712: iload         11
     714: isub
     715: ldc_w         #367                // int 1073741824
     718: invokestatic  #422                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     721: istore        11
     723: goto          756
     726: iload         9
     728: iload         10
     730: isub
     731: ldc_w         #367                // int 1073741824
     734: invokestatic  #422                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     737: istore        10
     739: iload         13
     741: ldc_w         #367                // int 1073741824
     744: iload         11
     746: aload_2
     747: getfield      #242                // Field android/support/v7/widget/GridLayoutManager$b.height:I
     750: iconst_0
     751: invokestatic  #229                // Method a:(IIIIZ)I
     754: istore        11
     756: aload_0
     757: aload_1
     758: iload         10
     760: iload         11
     762: iconst_1
     763: invokespecial #246                // Method a:(Landroid/view/View;IIZ)V
     766: goto          769
     769: iload         8
     771: iconst_1
     772: iadd
     773: istore        8
     775: goto          583
     778: iconst_0
     779: istore        13
     781: aload         4
     783: iload         9
     785: putfield      #423                // Field android/support/v7/widget/LinearLayoutManager$b.a:I
     788: aload_0
     789: getfield      #223                // Field i:I
     792: iconst_1
     793: if_icmpne     858
     796: aload_3
     797: getfield      #425                // Field android/support/v7/widget/LinearLayoutManager$c.f:I
     800: iconst_m1
     801: if_icmpne     838
     804: aload_3
     805: getfield      #426                // Field android/support/v7/widget/LinearLayoutManager$c.b:I
     808: istore        10
     810: iload         10
     812: istore        8
     814: iload         10
     816: iload         9
     818: isub
     819: istore        10
     821: iload         8
     823: istore        9
     825: iload         10
     827: istore        8
     829: iconst_0
     830: istore        10
     832: iconst_0
     833: istore        11
     835: goto          915
     838: aload_3
     839: getfield      #426                // Field android/support/v7/widget/LinearLayoutManager$c.b:I
     842: istore        10
     844: iload         10
     846: istore        8
     848: iload         9
     850: iload         10
     852: iadd
     853: istore        9
     855: goto          829
     858: aload_3
     859: getfield      #425                // Field android/support/v7/widget/LinearLayoutManager$c.f:I
     862: iconst_m1
     863: if_icmpne     896
     866: aload_3
     867: getfield      #426                // Field android/support/v7/widget/LinearLayoutManager$c.b:I
     870: istore        10
     872: iconst_0
     873: istore        8
     875: iconst_0
     876: istore        14
     878: iload         10
     880: istore        11
     882: iload         10
     884: iload         9
     886: isub
     887: istore        10
     889: iload         14
     891: istore        9
     893: goto          915
     896: aload_3
     897: getfield      #426                // Field android/support/v7/widget/LinearLayoutManager$c.b:I
     900: istore        10
     902: iload         9
     904: iload         10
     906: iadd
     907: istore        11
     909: iconst_0
     910: istore        8
     912: iconst_0
     913: istore        9
     915: iload         13
     917: iload         12
     919: if_icmpge     1144
     922: aload_0
     923: getfield      #123                // Field d:[Landroid/view/View;
     926: iload         13
     928: aaload
     929: astore_1
     930: aload_1
     931: invokevirtual #86                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     934: checkcast     #9                  // class android/support/v7/widget/GridLayoutManager$b
     937: astore_2
     938: aload_0
     939: getfield      #223                // Field i:I
     942: iconst_1
     943: if_icmpne     1030
     946: aload_0
     947: invokevirtual #270                // Method h:()Z
     950: ifeq          998
     953: aload_0
     954: invokevirtual #108                // Method A:()I
     957: aload_0
     958: getfield      #266                // Field c:[I
     961: aload_0
     962: getfield      #34                 // Field b:I
     965: aload_2
     966: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
     969: isub
     970: iaload
     971: iadd
     972: istore        11
     974: aload_0
     975: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
     978: aload_1
     979: invokevirtual #415                // Method android/support/v7/widget/ba.f:(Landroid/view/View;)I
     982: istore        14
     984: iload         11
     986: istore        10
     988: iload         11
     990: iload         14
     992: isub
     993: istore        11
     995: goto          1071
     998: aload_0
     999: invokevirtual #108                // Method A:()I
    1002: aload_0
    1003: getfield      #266                // Field c:[I
    1006: aload_2
    1007: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
    1010: iaload
    1011: iadd
    1012: istore        10
    1014: aload_0
    1015: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
    1018: aload_1
    1019: invokevirtual #415                // Method android/support/v7/widget/ba.f:(Landroid/view/View;)I
    1022: iload         10
    1024: iadd
    1025: istore        11
    1027: goto          1059
    1030: aload_0
    1031: invokevirtual #117                // Method B:()I
    1034: aload_0
    1035: getfield      #266                // Field c:[I
    1038: aload_2
    1039: getfield      #180                // Field android/support/v7/widget/GridLayoutManager$b.a:I
    1042: iaload
    1043: iadd
    1044: istore        8
    1046: aload_0
    1047: getfield      #233                // Field j:Landroid/support/v7/widget/ba;
    1050: aload_1
    1051: invokevirtual #415                // Method android/support/v7/widget/ba.f:(Landroid/view/View;)I
    1054: iload         8
    1056: iadd
    1057: istore        9
    1059: iload         10
    1061: istore        14
    1063: iload         11
    1065: istore        10
    1067: iload         14
    1069: istore        11
    1071: aload_0
    1072: aload_1
    1073: iload         11
    1075: iload         8
    1077: iload         10
    1079: iload         9
    1081: invokevirtual #429                // Method a:(Landroid/view/View;IIII)V
    1084: aload_2
    1085: invokevirtual #430                // Method android/support/v7/widget/GridLayoutManager$b.d:()Z
    1088: ifne          1098
    1091: aload_2
    1092: invokevirtual #432                // Method android/support/v7/widget/GridLayoutManager$b.e:()Z
    1095: ifeq          1104
    1098: aload         4
    1100: iconst_1
    1101: putfield      #434                // Field android/support/v7/widget/LinearLayoutManager$b.c:Z
    1104: aload         4
    1106: aload         4
    1108: getfield      #436                // Field android/support/v7/widget/LinearLayoutManager$b.d:Z
    1111: aload_1
    1112: invokevirtual #323                // Method android/view/View.hasFocusable:()Z
    1115: ior
    1116: putfield      #436                // Field android/support/v7/widget/LinearLayoutManager$b.d:Z
    1119: iload         13
    1121: iconst_1
    1122: iadd
    1123: istore        14
    1125: iload         10
    1127: istore        13
    1129: iload         11
    1131: istore        10
    1133: iload         13
    1135: istore        11
    1137: iload         14
    1139: istore        13
    1141: goto          915
    1144: aload_0
    1145: getfield      #123                // Field d:[Landroid/view/View;
    1148: aconst_null
    1149: invokestatic  #442                // Method java/util/Arrays.fill:([Ljava/lang/Object;Ljava/lang/Object;)V
    1152: return

  public void a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u, android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_3
       1: invokevirtual #86                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: astore        11
       6: aload         11
       8: instanceof    #9                  // class android/support/v7/widget/GridLayoutManager$b
      11: ifne          22
      14: aload_0
      15: aload_3
      16: aload         4
      18: invokespecial #446                // Method android/support/v7/widget/LinearLayoutManager.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
      21: return
      22: aload         11
      24: checkcast     #9                  // class android/support/v7/widget/GridLayoutManager$b
      27: astore_3
      28: aload_0
      29: aload_1
      30: aload_2
      31: aload_3
      32: invokevirtual #88                 // Method android/support/v7/widget/GridLayoutManager$b.f:()I
      35: invokespecial #280                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
      38: istore        5
      40: aload_0
      41: getfield      #223                // Field i:I
      44: ifne          118
      47: aload_3
      48: invokevirtual #96                 // Method android/support/v7/widget/GridLayoutManager$b.a:()I
      51: istore        6
      53: aload_3
      54: invokevirtual #90                 // Method android/support/v7/widget/GridLayoutManager$b.b:()I
      57: istore        9
      59: iconst_1
      60: istore        8
      62: aload_0
      63: getfield      #34                 // Field b:I
      66: iconst_1
      67: if_icmple     87
      70: aload_3
      71: invokevirtual #90                 // Method android/support/v7/widget/GridLayoutManager$b.b:()I
      74: aload_0
      75: getfield      #34                 // Field b:I
      78: if_icmpne     87
      81: iconst_1
      82: istore        10
      84: goto          90
      87: iconst_0
      88: istore        10
      90: iload         5
      92: istore        7
      94: iload         9
      96: istore        5
      98: aload         4
     100: iload         6
     102: iload         5
     104: iload         7
     106: iload         8
     108: iload         10
     110: iconst_0
     111: invokestatic  #451                // Method android/support/v4/view/a/b$c.a:(IIIIZZ)Landroid/support/v4/view/a/b$c;
     114: invokevirtual #456                // Method android/support/v4/view/a/b.b:(Ljava/lang/Object;)V
     117: return
     118: iconst_1
     119: istore        9
     121: aload_3
     122: invokevirtual #96                 // Method android/support/v7/widget/GridLayoutManager$b.a:()I
     125: istore        7
     127: aload_3
     128: invokevirtual #90                 // Method android/support/v7/widget/GridLayoutManager$b.b:()I
     131: istore        8
     133: aload_0
     134: getfield      #34                 // Field b:I
     137: iconst_1
     138: if_icmple     158
     141: aload_3
     142: invokevirtual #90                 // Method android/support/v7/widget/GridLayoutManager$b.b:()I
     145: aload_0
     146: getfield      #34                 // Field b:I
     149: if_icmpne     158
     152: iconst_1
     153: istore        10
     155: goto          161
     158: iconst_0
     159: istore        10
     161: iload         5
     163: istore        6
     165: iload         9
     167: istore        5
     169: goto          98

  public void a(android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #459                // Method android/support/v7/widget/LinearLayoutManager.a:(Landroid/support/v7/widget/RecyclerView$u;)V
       5: aload_0
       6: iconst_0
       7: putfield      #32                 // Field a:Z
      10: return

  void a(android.support.v7.widget.RecyclerView$u, android.support.v7.widget.LinearLayoutManager$c, android.support.v7.widget.RecyclerView$i$a);
    Code:
       0: aload_0
       1: getfield      #34                 // Field b:I
       4: istore        5
       6: iconst_0
       7: istore        4
       9: iload         4
      11: aload_0
      12: getfield      #34                 // Field b:I
      15: if_icmpge     89
      18: aload_2
      19: aload_1
      20: invokevirtual #376                // Method android/support/v7/widget/LinearLayoutManager$c.a:(Landroid/support/v7/widget/RecyclerView$u;)Z
      23: ifeq          89
      26: iload         5
      28: ifle          89
      31: aload_2
      32: getfield      #373                // Field android/support/v7/widget/LinearLayoutManager$c.d:I
      35: istore        6
      37: aload_3
      38: iload         6
      40: iconst_0
      41: aload_2
      42: getfield      #462                // Field android/support/v7/widget/LinearLayoutManager$c.g:I
      45: invokestatic  #171                // Method java/lang/Math.max:(II)I
      48: invokeinterface #466,  3          // InterfaceMethod android/support/v7/widget/RecyclerView$i$a.b:(II)V
      53: iload         5
      55: aload_0
      56: getfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
      59: iload         6
      61: invokevirtual #264                // Method android/support/v7/widget/GridLayoutManager$c.a:(I)I
      64: isub
      65: istore        5
      67: aload_2
      68: aload_2
      69: getfield      #373                // Field android/support/v7/widget/LinearLayoutManager$c.d:I
      72: aload_2
      73: getfield      #371                // Field android/support/v7/widget/LinearLayoutManager$c.e:I
      76: iadd
      77: putfield      #373                // Field android/support/v7/widget/LinearLayoutManager$c.d:I
      80: iload         4
      82: iconst_1
      83: iadd
      84: istore        4
      86: goto          9
      89: return

  public void a(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: getfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
       4: invokevirtual #338                // Method android/support/v7/widget/GridLayoutManager$c.a:()V
       7: return

  public void a(android.support.v7.widget.RecyclerView, int, int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
       4: invokevirtual #338                // Method android/support/v7/widget/GridLayoutManager$c.a:()V
       7: return

  public void a(android.support.v7.widget.RecyclerView, int, int, int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
       4: invokevirtual #338                // Method android/support/v7/widget/GridLayoutManager$c.a:()V
       7: return

  public void a(android.support.v7.widget.RecyclerView, int, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
       4: invokevirtual #338                // Method android/support/v7/widget/GridLayoutManager$c.a:()V
       7: return

  public void a(boolean);
    Code:
       0: iload_1
       1: ifeq          15
       4: new           #473                // class java/lang/UnsupportedOperationException
       7: dup
       8: ldc_w         #475                // String GridLayoutManager does not support stack from end. Consider using reverse layout
      11: invokespecial #476                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
      14: athrow
      15: aload_0
      16: iconst_0
      17: invokespecial #478                // Method android/support/v7/widget/LinearLayoutManager.a:(Z)V
      20: return

  public boolean a(android.support.v7.widget.RecyclerView$j);
    Code:
       0: aload_1
       1: instanceof    #9                  // class android/support/v7/widget/GridLayoutManager$b
       4: ireturn

  public int b(int, android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: invokespecial #273                // Method M:()V
       4: aload_0
       5: invokespecial #275                // Method N:()V
       8: aload_0
       9: iload_1
      10: aload_2
      11: aload_3
      12: invokespecial #481                // Method android/support/v7/widget/LinearLayoutManager.b:(ILandroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)I
      15: ireturn

  public int b(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #223                // Field i:I
       4: iconst_1
       5: if_icmpne     13
       8: aload_0
       9: getfield      #34                 // Field b:I
      12: ireturn
      13: aload_2
      14: invokevirtual #262                // Method android/support/v7/widget/RecyclerView$u.e:()I
      17: iconst_1
      18: if_icmpge     23
      21: iconst_0
      22: ireturn
      23: aload_0
      24: aload_1
      25: aload_2
      26: aload_2
      27: invokevirtual #262                // Method android/support/v7/widget/RecyclerView$u.e:()I
      30: iconst_1
      31: isub
      32: invokespecial #280                // Method a:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;I)I
      35: iconst_1
      36: iadd
      37: ireturn

  public void b(android.support.v7.widget.RecyclerView, int, int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field g:Landroid/support/v7/widget/GridLayoutManager$c;
       4: invokevirtual #338                // Method android/support/v7/widget/GridLayoutManager$c.a:()V
       7: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #485                // Field n:Landroid/support/v7/widget/LinearLayoutManager$d;
       4: ifnonnull     16
       7: aload_0
       8: getfield      #32                 // Field a:Z
      11: ifne          16
      14: iconst_1
      15: ireturn
      16: iconst_0
      17: ireturn

  public void c(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_2
       1: invokevirtual #129                // Method android/support/v7/widget/RecyclerView$u.a:()Z
       4: ifeq          11
       7: aload_0
       8: invokespecial #488                // Method L:()V
      11: aload_0
      12: aload_1
      13: aload_2
      14: invokespecial #490                // Method android/support/v7/widget/LinearLayoutManager.c:(Landroid/support/v7/widget/RecyclerView$p;Landroid/support/v7/widget/RecyclerView$u;)V
      17: aload_0
      18: invokespecial #492                // Method K:()V
      21: return
}
