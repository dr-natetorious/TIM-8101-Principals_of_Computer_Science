public class android.support.v7.view.menu.h implements android.support.v4.c.a.a {
  java.lang.CharSequence a;

  android.graphics.drawable.Drawable b;

  android.view.View c;

  static {};
    Code:
       0: bipush        6
       2: newarray       int
       4: dup
       5: iconst_0
       6: iconst_1
       7: iastore
       8: dup
       9: iconst_1
      10: iconst_4
      11: iastore
      12: dup
      13: iconst_2
      14: iconst_5
      15: iastore
      16: dup
      17: iconst_3
      18: iconst_3
      19: iastore
      20: dup
      21: iconst_4
      22: iconst_2
      23: iastore
      24: dup
      25: iconst_5
      26: iconst_0
      27: iastore
      28: putstatic     #55                 // Field d:[I
      31: return

  public android.support.v7.view.menu.h(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #60                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #62                 // Field p:I
       9: aload_0
      10: iconst_0
      11: putfield      #64                 // Field r:Z
      14: aload_0
      15: iconst_0
      16: putfield      #66                 // Field s:Z
      19: aload_0
      20: iconst_0
      21: putfield      #68                 // Field t:Z
      24: aload_0
      25: iconst_0
      26: putfield      #70                 // Field u:Z
      29: aload_0
      30: iconst_0
      31: putfield      #72                 // Field v:Z
      34: aload_0
      35: new           #74                 // class java/util/ArrayList
      38: dup
      39: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
      42: putfield      #77                 // Field w:Ljava/util/ArrayList;
      45: aload_0
      46: new           #79                 // class java/util/concurrent/CopyOnWriteArrayList
      49: dup
      50: invokespecial #80                 // Method java/util/concurrent/CopyOnWriteArrayList."<init>":()V
      53: putfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      56: aload_0
      57: aload_1
      58: putfield      #84                 // Field e:Landroid/content/Context;
      61: aload_0
      62: aload_1
      63: invokevirtual #90                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      66: putfield      #92                 // Field f:Landroid/content/res/Resources;
      69: aload_0
      70: new           #74                 // class java/util/ArrayList
      73: dup
      74: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
      77: putfield      #94                 // Field j:Ljava/util/ArrayList;
      80: aload_0
      81: new           #74                 // class java/util/ArrayList
      84: dup
      85: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
      88: putfield      #96                 // Field k:Ljava/util/ArrayList;
      91: aload_0
      92: iconst_1
      93: putfield      #98                 // Field l:Z
      96: aload_0
      97: new           #74                 // class java/util/ArrayList
     100: dup
     101: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
     104: putfield      #100                // Field m:Ljava/util/ArrayList;
     107: aload_0
     108: new           #74                 // class java/util/ArrayList
     111: dup
     112: invokespecial #75                 // Method java/util/ArrayList."<init>":()V
     115: putfield      #102                // Field n:Ljava/util/ArrayList;
     118: aload_0
     119: iconst_1
     120: putfield      #104                // Field o:Z
     123: aload_0
     124: iconst_1
     125: invokespecial #107                // Method e:(Z)V
     128: return

  public int a(int, int);
    Code:
       0: aload_0
       1: invokevirtual #253                // Method size:()I
       4: istore        4
       6: iload_2
       7: istore_3
       8: iload_2
       9: ifge          14
      12: iconst_0
      13: istore_3
      14: iload_3
      15: iload         4
      17: if_icmpge     47
      20: aload_0
      21: getfield      #94                 // Field j:Ljava/util/ArrayList;
      24: iload_3
      25: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #118                // class android/support/v7/view/menu/j
      31: invokevirtual #256                // Method android/support/v7/view/menu/j.getGroupId:()I
      34: iload_1
      35: if_icmpne     40
      38: iload_3
      39: ireturn
      40: iload_3
      41: iconst_1
      42: iadd
      43: istore_3
      44: goto          14
      47: iconst_m1
      48: ireturn

  public android.support.v7.view.menu.h a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #62                 // Field p:I
       5: aload_0
       6: areturn

  protected android.support.v7.view.menu.h a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: iconst_0
       2: aconst_null
       3: iconst_0
       4: aload_1
       5: aconst_null
       6: invokespecial #260                // Method a:(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
       9: aload_0
      10: areturn

  protected android.support.v7.view.menu.h a(android.view.View);
    Code:
       0: aload_0
       1: iconst_0
       2: aconst_null
       3: iconst_0
       4: aconst_null
       5: aload_1
       6: invokespecial #260                // Method a:(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
       9: aload_0
      10: areturn

  protected android.support.v7.view.menu.h a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: iconst_0
       2: aload_1
       3: iconst_0
       4: aconst_null
       5: aconst_null
       6: invokespecial #260                // Method a:(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
       9: aload_0
      10: areturn

  android.support.v7.view.menu.j a(int, android.view.KeyEvent);
    Code:
       0: aload_0
       1: getfield      #77                 // Field w:Ljava/util/ArrayList;
       4: astore        8
       6: aload         8
       8: invokevirtual #266                // Method java/util/ArrayList.clear:()V
      11: aload_0
      12: aload         8
      14: iload_1
      15: aload_2
      16: invokevirtual #269                // Method a:(Ljava/util/List;ILandroid/view/KeyEvent;)V
      19: aload         8
      21: invokevirtual #270                // Method java/util/ArrayList.isEmpty:()Z
      24: ifeq          29
      27: aconst_null
      28: areturn
      29: aload_2
      30: invokevirtual #275                // Method android/view/KeyEvent.getMetaState:()I
      33: istore        5
      35: new           #277                // class android/view/KeyCharacterMap$KeyData
      38: dup
      39: invokespecial #278                // Method android/view/KeyCharacterMap$KeyData."<init>":()V
      42: astore        9
      44: aload_2
      45: aload         9
      47: invokevirtual #282                // Method android/view/KeyEvent.getKeyData:(Landroid/view/KeyCharacterMap$KeyData;)Z
      50: pop
      51: aload         8
      53: invokevirtual #112                // Method java/util/ArrayList.size:()I
      56: istore        6
      58: iload         6
      60: iconst_1
      61: if_icmpne     74
      64: aload         8
      66: iconst_0
      67: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      70: checkcast     #118                // class android/support/v7/view/menu/j
      73: areturn
      74: aload_0
      75: invokevirtual #284                // Method b:()Z
      78: istore        7
      80: iconst_0
      81: istore_3
      82: iload_3
      83: iload         6
      85: if_icmpge     183
      88: aload         8
      90: iload_3
      91: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      94: checkcast     #118                // class android/support/v7/view/menu/j
      97: astore_2
      98: iload         7
     100: ifeq          112
     103: aload_2
     104: invokevirtual #288                // Method android/support/v7/view/menu/j.getAlphabeticShortcut:()C
     107: istore        4
     109: goto          118
     112: aload_2
     113: invokevirtual #291                // Method android/support/v7/view/menu/j.getNumericShortcut:()C
     116: istore        4
     118: iload         4
     120: aload         9
     122: getfield      #295                // Field android/view/KeyCharacterMap$KeyData.meta:[C
     125: iconst_0
     126: caload
     127: if_icmpne     137
     130: iload         5
     132: iconst_2
     133: iand
     134: ifeq          174
     137: iload         4
     139: aload         9
     141: getfield      #295                // Field android/view/KeyCharacterMap$KeyData.meta:[C
     144: iconst_2
     145: caload
     146: if_icmpne     156
     149: iload         5
     151: iconst_2
     152: iand
     153: ifne          174
     156: iload         7
     158: ifeq          176
     161: iload         4
     163: bipush        8
     165: if_icmpne     176
     168: iload_1
     169: bipush        67
     171: if_icmpne     176
     174: aload_2
     175: areturn
     176: iload_3
     177: iconst_1
     178: iadd
     179: istore_3
     180: goto          82
     183: aconst_null
     184: areturn

  protected android.view.MenuItem a(int, int, int, java.lang.CharSequence);
    Code:
       0: iload_3
       1: invokestatic  #298                // Method f:(I)I
       4: istore        5
       6: aload_0
       7: iload_1
       8: iload_2
       9: iload_3
      10: iload         5
      12: aload         4
      14: aload_0
      15: getfield      #62                 // Field p:I
      18: invokespecial #300                // Method a:(IIIILjava/lang/CharSequence;I)Landroid/support/v7/view/menu/j;
      21: astore        4
      23: aload_0
      24: getfield      #302                // Field q:Landroid/view/ContextMenu$ContextMenuInfo;
      27: ifnull        39
      30: aload         4
      32: aload_0
      33: getfield      #302                // Field q:Landroid/view/ContextMenu$ContextMenuInfo;
      36: invokevirtual #305                // Method android/support/v7/view/menu/j.a:(Landroid/view/ContextMenu$ContextMenuInfo;)V
      39: aload_0
      40: getfield      #94                 // Field j:Ljava/util/ArrayList;
      43: aload_0
      44: getfield      #94                 // Field j:Ljava/util/ArrayList;
      47: iload         5
      49: invokestatic  #307                // Method a:(Ljava/util/ArrayList;I)I
      52: aload         4
      54: invokevirtual #310                // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
      57: aload_0
      58: iconst_1
      59: invokevirtual #151                // Method a:(Z)V
      62: aload         4
      64: areturn

  protected java.lang.String a();
    Code:
       0: ldc_w         #313                // String android:menu:actionviewstates
       3: areturn

  public void a(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #315                // Method e:(Landroid/os/Bundle;)V
       5: return

  public void a(android.support.v7.view.menu.h$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #318                // Field i:Landroid/support/v7/view/menu/h$a;
       5: return

  void a(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #98                 // Field l:Z
       5: aload_0
       6: iconst_1
       7: invokevirtual #151                // Method a:(Z)V
      10: return

  public void a(android.support.v7.view.menu.o);
    Code:
       0: aload_0
       1: aload_1
       2: aload_0
       3: getfield      #84                 // Field e:Landroid/content/Context;
       6: invokevirtual #323                // Method a:(Landroid/support/v7/view/menu/o;Landroid/content/Context;)V
       9: return

  public void a(android.support.v7.view.menu.o, android.content.Context);
    Code:
       0: aload_0
       1: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
       4: new           #180                // class java/lang/ref/WeakReference
       7: dup
       8: aload_1
       9: invokespecial #326                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      12: invokevirtual #328                // Method java/util/concurrent/CopyOnWriteArrayList.add:(Ljava/lang/Object;)Z
      15: pop
      16: aload_1
      17: aload_2
      18: aload_0
      19: invokeinterface #331,  3          // InterfaceMethod android/support/v7/view/menu/o.a:(Landroid/content/Context;Landroid/support/v7/view/menu/h;)V
      24: aload_0
      25: iconst_1
      26: putfield      #104                // Field o:Z
      29: return

  void a(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #335,  1          // InterfaceMethod android/view/MenuItem.getGroupId:()I
       6: istore_3
       7: aload_0
       8: getfield      #94                 // Field j:Ljava/util/ArrayList;
      11: invokevirtual #112                // Method java/util/ArrayList.size:()I
      14: istore        4
      16: aload_0
      17: invokevirtual #187                // Method g:()V
      20: iconst_0
      21: istore_2
      22: iload_2
      23: iload         4
      25: if_icmpge     101
      28: aload_0
      29: getfield      #94                 // Field j:Ljava/util/ArrayList;
      32: iload_2
      33: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      36: checkcast     #118                // class android/support/v7/view/menu/j
      39: astore        6
      41: aload         6
      43: invokevirtual #256                // Method android/support/v7/view/menu/j.getGroupId:()I
      46: iload_3
      47: if_icmpne     94
      50: aload         6
      52: invokevirtual #337                // Method android/support/v7/view/menu/j.g:()Z
      55: ifne          61
      58: goto          94
      61: aload         6
      63: invokevirtual #340                // Method android/support/v7/view/menu/j.isCheckable:()Z
      66: ifne          72
      69: goto          94
      72: aload         6
      74: aload_1
      75: if_acmpne     84
      78: iconst_1
      79: istore        5
      81: goto          87
      84: iconst_0
      85: istore        5
      87: aload         6
      89: iload         5
      91: invokevirtual #342                // Method android/support/v7/view/menu/j.b:(Z)V
      94: iload_2
      95: iconst_1
      96: iadd
      97: istore_2
      98: goto          22
     101: aload_0
     102: invokevirtual #190                // Method h:()V
     105: return

  void a(java.util.List<android.support.v7.view.menu.j>, int, android.view.KeyEvent);
    Code:
       0: aload_0
       1: invokevirtual #284                // Method b:()Z
       4: istore        9
       6: aload_3
       7: invokevirtual #345                // Method android/view/KeyEvent.getModifiers:()I
      10: istore        7
      12: new           #277                // class android/view/KeyCharacterMap$KeyData
      15: dup
      16: invokespecial #278                // Method android/view/KeyCharacterMap$KeyData."<init>":()V
      19: astore        10
      21: aload_3
      22: aload         10
      24: invokevirtual #282                // Method android/view/KeyEvent.getKeyData:(Landroid/view/KeyCharacterMap$KeyData;)Z
      27: ifne          37
      30: iload_2
      31: bipush        67
      33: if_icmpeq     37
      36: return
      37: aload_0
      38: getfield      #94                 // Field j:Ljava/util/ArrayList;
      41: invokevirtual #112                // Method java/util/ArrayList.size:()I
      44: istore        8
      46: iconst_0
      47: istore        4
      49: iload         4
      51: iload         8
      53: if_icmpge     238
      56: aload_0
      57: getfield      #94                 // Field j:Ljava/util/ArrayList;
      60: iload         4
      62: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      65: checkcast     #118                // class android/support/v7/view/menu/j
      68: astore        11
      70: aload         11
      72: invokevirtual #348                // Method android/support/v7/view/menu/j.hasSubMenu:()Z
      75: ifeq          92
      78: aload         11
      80: invokevirtual #352                // Method android/support/v7/view/menu/j.getSubMenu:()Landroid/view/SubMenu;
      83: checkcast     #2                  // class android/support/v7/view/menu/h
      86: aload_1
      87: iload_2
      88: aload_3
      89: invokevirtual #269                // Method a:(Ljava/util/List;ILandroid/view/KeyEvent;)V
      92: iload         9
      94: ifeq          107
      97: aload         11
      99: invokevirtual #288                // Method android/support/v7/view/menu/j.getAlphabeticShortcut:()C
     102: istore        5
     104: goto          114
     107: aload         11
     109: invokevirtual #291                // Method android/support/v7/view/menu/j.getNumericShortcut:()C
     112: istore        5
     114: iload         9
     116: ifeq          129
     119: aload         11
     121: invokevirtual #355                // Method android/support/v7/view/menu/j.getAlphabeticModifiers:()I
     124: istore        6
     126: goto          136
     129: aload         11
     131: invokevirtual #358                // Method android/support/v7/view/menu/j.getNumericModifiers:()I
     134: istore        6
     136: iload         7
     138: ldc_w         #359                // int 69647
     141: iand
     142: iload         6
     144: ldc_w         #359                // int 69647
     147: iand
     148: if_icmpne     157
     151: iconst_1
     152: istore        6
     154: goto          160
     157: iconst_0
     158: istore        6
     160: iload         6
     162: ifeq          229
     165: iload         5
     167: ifeq          229
     170: iload         5
     172: aload         10
     174: getfield      #295                // Field android/view/KeyCharacterMap$KeyData.meta:[C
     177: iconst_0
     178: caload
     179: if_icmpeq     212
     182: iload         5
     184: aload         10
     186: getfield      #295                // Field android/view/KeyCharacterMap$KeyData.meta:[C
     189: iconst_2
     190: caload
     191: if_icmpeq     212
     194: iload         9
     196: ifeq          229
     199: iload         5
     201: bipush        8
     203: if_icmpne     229
     206: iload_2
     207: bipush        67
     209: if_icmpne     229
     212: aload         11
     214: invokevirtual #362                // Method android/support/v7/view/menu/j.isEnabled:()Z
     217: ifeq          229
     220: aload_1
     221: aload         11
     223: invokeinterface #365,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     228: pop
     229: iload         4
     231: iconst_1
     232: iadd
     233: istore        4
     235: goto          49
     238: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #64                 // Field r:Z
       4: ifne          27
       7: iload_1
       8: ifeq          21
      11: aload_0
      12: iconst_1
      13: putfield      #98                 // Field l:Z
      16: aload_0
      17: iconst_1
      18: putfield      #104                // Field o:Z
      21: aload_0
      22: iload_1
      23: invokespecial #368                // Method d:(Z)V
      26: return
      27: aload_0
      28: iconst_1
      29: putfield      #66                 // Field s:Z
      32: iload_1
      33: ifeq          41
      36: aload_0
      37: iconst_1
      38: putfield      #68                 // Field t:Z
      41: return

  boolean a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #318                // Field i:Landroid/support/v7/view/menu/h$a;
       4: ifnull        23
       7: aload_0
       8: getfield      #318                // Field i:Landroid/support/v7/view/menu/h$a;
      11: aload_1
      12: aload_2
      13: invokeinterface #371,  3          // InterfaceMethod android/support/v7/view/menu/h$a.a:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)Z
      18: ifeq          23
      21: iconst_1
      22: ireturn
      23: iconst_0
      24: ireturn

  public boolean a(android.view.MenuItem, int);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: iload_2
       4: invokevirtual #375                // Method a:(Landroid/view/MenuItem;Landroid/support/v7/view/menu/o;I)Z
       7: ireturn

  public boolean a(android.view.MenuItem, android.support.v7.view.menu.o, int);
    Code:
       0: aload_1
       1: checkcast     #118                // class android/support/v7/view/menu/j
       4: astore        7
       6: aload         7
       8: ifnull        216
      11: aload         7
      13: invokevirtual #362                // Method android/support/v7/view/menu/j.isEnabled:()Z
      16: ifne          21
      19: iconst_0
      20: ireturn
      21: aload         7
      23: invokevirtual #376                // Method android/support/v7/view/menu/j.b:()Z
      26: istore        6
      28: aload         7
      30: invokevirtual #379                // Method android/support/v7/view/menu/j.a:()Landroid/support/v4/view/c;
      33: astore_1
      34: aload_1
      35: ifnull        51
      38: aload_1
      39: invokevirtual #383                // Method android/support/v4/view/c.e:()Z
      42: ifeq          51
      45: iconst_1
      46: istore        4
      48: goto          54
      51: iconst_0
      52: istore        4
      54: aload         7
      56: invokevirtual #385                // Method android/support/v7/view/menu/j.n:()Z
      59: ifeq          93
      62: iload         6
      64: aload         7
      66: invokevirtual #388                // Method android/support/v7/view/menu/j.expandActionView:()Z
      69: ior
      70: istore        6
      72: iload         6
      74: istore        5
      76: iload         6
      78: ifeq          213
      81: iload         6
      83: istore        5
      85: aload_0
      86: iconst_1
      87: invokevirtual #389                // Method b:(Z)V
      90: iload         5
      92: ireturn
      93: aload         7
      95: invokevirtual #348                // Method android/support/v7/view/menu/j.hasSubMenu:()Z
      98: ifne          126
     101: iload         4
     103: ifeq          109
     106: goto          126
     109: iload         6
     111: istore        5
     113: iload_3
     114: iconst_1
     115: iand
     116: ifne          213
     119: iload         6
     121: istore        5
     123: goto          85
     126: iload_3
     127: iconst_4
     128: iand
     129: ifne          137
     132: aload_0
     133: iconst_0
     134: invokevirtual #389                // Method b:(Z)V
     137: aload         7
     139: invokevirtual #348                // Method android/support/v7/view/menu/j.hasSubMenu:()Z
     142: ifne          164
     145: aload         7
     147: new           #391                // class android/support/v7/view/menu/u
     150: dup
     151: aload_0
     152: invokevirtual #144                // Method e:()Landroid/content/Context;
     155: aload_0
     156: aload         7
     158: invokespecial #394                // Method android/support/v7/view/menu/u."<init>":(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/support/v7/view/menu/j;)V
     161: invokevirtual #397                // Method android/support/v7/view/menu/j.a:(Landroid/support/v7/view/menu/u;)V
     164: aload         7
     166: invokevirtual #352                // Method android/support/v7/view/menu/j.getSubMenu:()Landroid/view/SubMenu;
     169: checkcast     #391                // class android/support/v7/view/menu/u
     172: astore        7
     174: iload         4
     176: ifeq          185
     179: aload_1
     180: aload         7
     182: invokevirtual #400                // Method android/support/v4/view/c.a:(Landroid/view/SubMenu;)V
     185: iload         6
     187: aload_0
     188: aload         7
     190: aload_2
     191: invokespecial #402                // Method a:(Landroid/support/v7/view/menu/u;Landroid/support/v7/view/menu/o;)Z
     194: ior
     195: istore        6
     197: iload         6
     199: istore        5
     201: iload         6
     203: ifne          213
     206: iload         6
     208: istore        5
     210: goto          85
     213: iload         5
     215: ireturn
     216: iconst_0
     217: ireturn

  public android.view.MenuItem add(int);
    Code:
       0: aload_0
       1: iconst_0
       2: iconst_0
       3: iconst_0
       4: aload_0
       5: getfield      #92                 // Field f:Landroid/content/res/Resources;
       8: iload_1
       9: invokevirtual #407                // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      12: invokevirtual #409                // Method a:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
      15: areturn

  public android.view.MenuItem add(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: aload_0
       5: getfield      #92                 // Field f:Landroid/content/res/Resources;
       8: iload         4
      10: invokevirtual #407                // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      13: invokevirtual #409                // Method a:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
      16: areturn

  public android.view.MenuItem add(int, int, int, java.lang.CharSequence);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: aload         4
       6: invokevirtual #409                // Method a:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
       9: areturn

  public android.view.MenuItem add(java.lang.CharSequence);
    Code:
       0: aload_0
       1: iconst_0
       2: iconst_0
       3: iconst_0
       4: aload_1
       5: invokevirtual #409                // Method a:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
       8: areturn

  public int addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]);
    Code:
       0: aload_0
       1: getfield      #84                 // Field e:Landroid/content/Context;
       4: invokevirtual #417                // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
       7: astore        12
       9: iconst_0
      10: istore        11
      12: aload         12
      14: aload         4
      16: aload         5
      18: aload         6
      20: iconst_0
      21: invokevirtual #423                // Method android/content/pm/PackageManager.queryIntentActivityOptions:(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
      24: astore        13
      26: aload         13
      28: ifnull        43
      31: aload         13
      33: invokeinterface #424,  1          // InterfaceMethod java/util/List.size:()I
      38: istore        9
      40: goto          46
      43: iconst_0
      44: istore        9
      46: iload         11
      48: istore        10
      50: iload         7
      52: iconst_1
      53: iand
      54: ifne          66
      57: aload_0
      58: iload_1
      59: invokevirtual #428                // Method removeGroup:(I)V
      62: iload         11
      64: istore        10
      66: iload         10
      68: iload         9
      70: if_icmpge     222
      73: aload         13
      75: iload         10
      77: invokeinterface #429,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      82: checkcast     #431                // class android/content/pm/ResolveInfo
      85: astore        14
      87: aload         14
      89: getfield      #434                // Field android/content/pm/ResolveInfo.specificIndex:I
      92: ifge          102
      95: aload         6
      97: astore        4
      99: goto          112
     102: aload         5
     104: aload         14
     106: getfield      #434                // Field android/content/pm/ResolveInfo.specificIndex:I
     109: aaload
     110: astore        4
     112: new           #436                // class android/content/Intent
     115: dup
     116: aload         4
     118: invokespecial #439                // Method android/content/Intent."<init>":(Landroid/content/Intent;)V
     121: astore        4
     123: aload         4
     125: new           #441                // class android/content/ComponentName
     128: dup
     129: aload         14
     131: getfield      #445                // Field android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
     134: getfield      #451                // Field android/content/pm/ActivityInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
     137: getfield      #457                // Field android/content/pm/ApplicationInfo.packageName:Ljava/lang/String;
     140: aload         14
     142: getfield      #445                // Field android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
     145: getfield      #460                // Field android/content/pm/ActivityInfo.name:Ljava/lang/String;
     148: invokespecial #463                // Method android/content/ComponentName."<init>":(Ljava/lang/String;Ljava/lang/String;)V
     151: invokevirtual #467                // Method android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
     154: pop
     155: aload_0
     156: iload_1
     157: iload_2
     158: iload_3
     159: aload         14
     161: aload         12
     163: invokevirtual #471                // Method android/content/pm/ResolveInfo.loadLabel:(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
     166: invokevirtual #473                // Method add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
     169: aload         14
     171: aload         12
     173: invokevirtual #477                // Method android/content/pm/ResolveInfo.loadIcon:(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
     176: invokeinterface #481,  2          // InterfaceMethod android/view/MenuItem.setIcon:(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
     181: aload         4
     183: invokeinterface #485,  2          // InterfaceMethod android/view/MenuItem.setIntent:(Landroid/content/Intent;)Landroid/view/MenuItem;
     188: astore        4
     190: aload         8
     192: ifnull        213
     195: aload         14
     197: getfield      #434                // Field android/content/pm/ResolveInfo.specificIndex:I
     200: iflt          213
     203: aload         8
     205: aload         14
     207: getfield      #434                // Field android/content/pm/ResolveInfo.specificIndex:I
     210: aload         4
     212: aastore
     213: iload         10
     215: iconst_1
     216: iadd
     217: istore        10
     219: goto          66
     222: iload         9
     224: ireturn

  public android.view.SubMenu addSubMenu(int);
    Code:
       0: aload_0
       1: iconst_0
       2: iconst_0
       3: iconst_0
       4: aload_0
       5: getfield      #92                 // Field f:Landroid/content/res/Resources;
       8: iload_1
       9: invokevirtual #407                // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      12: invokevirtual #490                // Method addSubMenu:(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
      15: areturn

  public android.view.SubMenu addSubMenu(int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: aload_0
       5: getfield      #92                 // Field f:Landroid/content/res/Resources;
       8: iload         4
      10: invokevirtual #407                // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      13: invokevirtual #490                // Method addSubMenu:(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
      16: areturn

  public android.view.SubMenu addSubMenu(int, int, int, java.lang.CharSequence);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: aload         4
       6: invokevirtual #409                // Method a:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
       9: checkcast     #118                // class android/support/v7/view/menu/j
      12: astore        4
      14: new           #391                // class android/support/v7/view/menu/u
      17: dup
      18: aload_0
      19: getfield      #84                 // Field e:Landroid/content/Context;
      22: aload_0
      23: aload         4
      25: invokespecial #394                // Method android/support/v7/view/menu/u."<init>":(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/support/v7/view/menu/j;)V
      28: astore        5
      30: aload         4
      32: aload         5
      34: invokevirtual #397                // Method android/support/v7/view/menu/j.a:(Landroid/support/v7/view/menu/u;)V
      37: aload         5
      39: areturn

  public android.view.SubMenu addSubMenu(java.lang.CharSequence);
    Code:
       0: aload_0
       1: iconst_0
       2: iconst_0
       3: iconst_0
       4: aload_1
       5: invokevirtual #490                // Method addSubMenu:(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
       8: areturn

  public int b(int);
    Code:
       0: aload_0
       1: invokevirtual #253                // Method size:()I
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iload_2
       8: iload_3
       9: if_icmpge     39
      12: aload_0
      13: getfield      #94                 // Field j:Ljava/util/ArrayList;
      16: iload_2
      17: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      20: checkcast     #118                // class android/support/v7/view/menu/j
      23: invokevirtual #495                // Method android/support/v7/view/menu/j.getItemId:()I
      26: iload_1
      27: if_icmpne     32
      30: iload_2
      31: ireturn
      32: iload_2
      33: iconst_1
      34: iadd
      35: istore_2
      36: goto          7
      39: iconst_m1
      40: ireturn

  public void b(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #497                // Method f:(Landroid/os/Bundle;)V
       5: return

  void b(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #104                // Field o:Z
       5: aload_0
       6: iconst_1
       7: invokevirtual #151                // Method a:(Z)V
      10: return

  public void b(android.support.v7.view.menu.o);
    Code:
       0: aload_0
       1: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
       4: invokevirtual #169                // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
       7: astore_2
       8: aload_2
       9: invokeinterface #174,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      14: ifeq          59
      17: aload_2
      18: invokeinterface #178,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: checkcast     #180                // class java/lang/ref/WeakReference
      26: astore_3
      27: aload_3
      28: invokevirtual #182                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      31: checkcast     #162                // class android/support/v7/view/menu/o
      34: astore        4
      36: aload         4
      38: ifnull        47
      41: aload         4
      43: aload_1
      44: if_acmpne     8
      47: aload_0
      48: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      51: aload_3
      52: invokevirtual #185                // Method java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
      55: pop
      56: goto          8
      59: return

  public final void b(boolean);
    Code:
       0: aload_0
       1: getfield      #72                 // Field v:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: iconst_1
      10: putfield      #72                 // Field v:Z
      13: aload_0
      14: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      17: invokevirtual #169                // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      20: astore_2
      21: aload_2
      22: invokeinterface #174,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      27: ifeq          78
      30: aload_2
      31: invokeinterface #178,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      36: checkcast     #180                // class java/lang/ref/WeakReference
      39: astore_3
      40: aload_3
      41: invokevirtual #182                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      44: checkcast     #162                // class android/support/v7/view/menu/o
      47: astore        4
      49: aload         4
      51: ifnonnull     66
      54: aload_0
      55: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      58: aload_3
      59: invokevirtual #185                // Method java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
      62: pop
      63: goto          21
      66: aload         4
      68: aload_0
      69: iload_1
      70: invokeinterface #500,  3          // InterfaceMethod android/support/v7/view/menu/o.a:(Landroid/support/v7/view/menu/h;Z)V
      75: goto          21
      78: aload_0
      79: iconst_0
      80: putfield      #72                 // Field v:Z
      83: return

  boolean b();
    Code:
       0: aload_0
       1: getfield      #502                // Field g:Z
       4: ireturn

  public int c(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_0
       3: invokevirtual #504                // Method a:(II)I
       6: ireturn

  public void c(android.os.Bundle);
    Code:
       0: aload_0
       1: invokevirtual #253                // Method size:()I
       4: istore_3
       5: aconst_null
       6: astore        4
       8: iconst_0
       9: istore_2
      10: iload_2
      11: iload_3
      12: if_icmpge     145
      15: aload_0
      16: iload_2
      17: invokevirtual #507                // Method getItem:(I)Landroid/view/MenuItem;
      20: astore        7
      22: aload         7
      24: invokeinterface #511,  1          // InterfaceMethod android/view/MenuItem.getActionView:()Landroid/view/View;
      29: astore        8
      31: aload         4
      33: astore        6
      35: aload         8
      37: ifnull        110
      40: aload         4
      42: astore        6
      44: aload         8
      46: invokevirtual #516                // Method android/view/View.getId:()I
      49: iconst_m1
      50: if_icmpeq     110
      53: aload         4
      55: astore        5
      57: aload         4
      59: ifnonnull     71
      62: new           #193                // class android/util/SparseArray
      65: dup
      66: invokespecial #194                // Method android/util/SparseArray."<init>":()V
      69: astore        5
      71: aload         8
      73: aload         5
      75: invokevirtual #520                // Method android/view/View.saveHierarchyState:(Landroid/util/SparseArray;)V
      78: aload         5
      80: astore        6
      82: aload         7
      84: invokeinterface #523,  1          // InterfaceMethod android/view/MenuItem.isActionViewExpanded:()Z
      89: ifeq          110
      92: aload_1
      93: ldc_w         #525                // String android:menu:expandedactionview
      96: aload         7
      98: invokeinterface #526,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
     103: invokevirtual #530                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
     106: aload         5
     108: astore        6
     110: aload         7
     112: invokeinterface #531,  1          // InterfaceMethod android/view/MenuItem.hasSubMenu:()Z
     117: ifeq          134
     120: aload         7
     122: invokeinterface #532,  1          // InterfaceMethod android/view/MenuItem.getSubMenu:()Landroid/view/SubMenu;
     127: checkcast     #391                // class android/support/v7/view/menu/u
     130: aload_1
     131: invokevirtual #534                // Method android/support/v7/view/menu/u.c:(Landroid/os/Bundle;)V
     134: iload_2
     135: iconst_1
     136: iadd
     137: istore_2
     138: aload         6
     140: astore        4
     142: goto          10
     145: aload         4
     147: ifnull        160
     150: aload_1
     151: aload_0
     152: invokevirtual #536                // Method a:()Ljava/lang/String;
     155: aload         4
     157: invokevirtual #211                // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
     160: return

  public void c(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #538                // Field z:Z
       5: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #231                // Field h:Z
       4: ireturn

  public boolean c(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
       4: invokevirtual #160                // Method java/util/concurrent/CopyOnWriteArrayList.isEmpty:()Z
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iload_3
      11: ifeq          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: invokevirtual #187                // Method g:()V
      20: aload_0
      21: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      24: invokevirtual #169                // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      27: astore        4
      29: iload_2
      30: istore_3
      31: aload         4
      33: invokeinterface #174,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      38: ifeq          97
      41: aload         4
      43: invokeinterface #178,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      48: checkcast     #180                // class java/lang/ref/WeakReference
      51: astore        5
      53: aload         5
      55: invokevirtual #182                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      58: checkcast     #162                // class android/support/v7/view/menu/o
      61: astore        6
      63: aload         6
      65: ifnonnull     81
      68: aload_0
      69: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      72: aload         5
      74: invokevirtual #185                // Method java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
      77: pop
      78: goto          29
      81: aload         6
      83: aload_0
      84: aload_1
      85: invokeinterface #542,  3          // InterfaceMethod android/support/v7/view/menu/o.a:(Landroid/support/v7/view/menu/h;Landroid/support/v7/view/menu/j;)Z
      90: istore_3
      91: iload_3
      92: istore_2
      93: iload_3
      94: ifeq          29
      97: aload_0
      98: invokevirtual #190                // Method h:()V
     101: iload_3
     102: ifeq          110
     105: aload_0
     106: aload_1
     107: putfield      #544                // Field y:Landroid/support/v7/view/menu/j;
     110: iload_3
     111: ireturn

  public void clear();
    Code:
       0: aload_0
       1: getfield      #544                // Field y:Landroid/support/v7/view/menu/j;
       4: ifnull        16
       7: aload_0
       8: aload_0
       9: getfield      #544                // Field y:Landroid/support/v7/view/menu/j;
      12: invokevirtual #546                // Method d:(Landroid/support/v7/view/menu/j;)Z
      15: pop
      16: aload_0
      17: getfield      #94                 // Field j:Ljava/util/ArrayList;
      20: invokevirtual #266                // Method java/util/ArrayList.clear:()V
      23: aload_0
      24: iconst_1
      25: invokevirtual #151                // Method a:(Z)V
      28: return

  public void clearHeader();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #135                // Field b:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: aconst_null
       7: putfield      #133                // Field a:Ljava/lang/CharSequence;
      10: aload_0
      11: aconst_null
      12: putfield      #131                // Field c:Landroid/view/View;
      15: aload_0
      16: iconst_0
      17: invokevirtual #151                // Method a:(Z)V
      20: return

  public void close();
    Code:
       0: aload_0
       1: iconst_1
       2: invokevirtual #389                // Method b:(Z)V
       5: return

  android.content.res.Resources d();
    Code:
       0: aload_0
       1: getfield      #92                 // Field f:Landroid/content/res/Resources;
       4: areturn

  protected android.support.v7.view.menu.h d(int);
    Code:
       0: aload_0
       1: iload_1
       2: aconst_null
       3: iconst_0
       4: aconst_null
       5: aconst_null
       6: invokespecial #260                // Method a:(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
       9: aload_0
      10: areturn

  public void d(android.os.Bundle);
    Code:
       0: aload_1
       1: ifnonnull     5
       4: return
       5: aload_1
       6: aload_0
       7: invokevirtual #536                // Method a:()Ljava/lang/String;
      10: invokevirtual #245                // Method android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
      13: astore        4
      15: aload_0
      16: invokevirtual #253                // Method size:()I
      19: istore_3
      20: iconst_0
      21: istore_2
      22: iload_2
      23: iload_3
      24: if_icmpge     95
      27: aload_0
      28: iload_2
      29: invokevirtual #507                // Method getItem:(I)Landroid/view/MenuItem;
      32: astore        5
      34: aload         5
      36: invokeinterface #511,  1          // InterfaceMethod android/view/MenuItem.getActionView:()Landroid/view/View;
      41: astore        6
      43: aload         6
      45: ifnull        64
      48: aload         6
      50: invokevirtual #516                // Method android/view/View.getId:()I
      53: iconst_m1
      54: if_icmpeq     64
      57: aload         6
      59: aload         4
      61: invokevirtual #551                // Method android/view/View.restoreHierarchyState:(Landroid/util/SparseArray;)V
      64: aload         5
      66: invokeinterface #531,  1          // InterfaceMethod android/view/MenuItem.hasSubMenu:()Z
      71: ifeq          88
      74: aload         5
      76: invokeinterface #532,  1          // InterfaceMethod android/view/MenuItem.getSubMenu:()Landroid/view/SubMenu;
      81: checkcast     #391                // class android/support/v7/view/menu/u
      84: aload_1
      85: invokevirtual #553                // Method android/support/v7/view/menu/u.d:(Landroid/os/Bundle;)V
      88: iload_2
      89: iconst_1
      90: iadd
      91: istore_2
      92: goto          22
      95: aload_1
      96: ldc_w         #525                // String android:menu:expandedactionview
      99: invokevirtual #557                // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
     102: istore_2
     103: iload_2
     104: ifle          124
     107: aload_0
     108: iload_2
     109: invokevirtual #560                // Method findItem:(I)Landroid/view/MenuItem;
     112: astore_1
     113: aload_1
     114: ifnull        124
     117: aload_1
     118: invokeinterface #561,  1          // InterfaceMethod android/view/MenuItem.expandActionView:()Z
     123: pop
     124: return

  public boolean d(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
       4: invokevirtual #160                // Method java/util/concurrent/CopyOnWriteArrayList.isEmpty:()Z
       7: istore        4
       9: iconst_0
      10: istore_2
      11: iconst_0
      12: istore_3
      13: iload         4
      15: ifne          128
      18: aload_0
      19: getfield      #544                // Field y:Landroid/support/v7/view/menu/j;
      22: aload_1
      23: if_acmpeq     28
      26: iconst_0
      27: ireturn
      28: aload_0
      29: invokevirtual #187                // Method g:()V
      32: aload_0
      33: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      36: invokevirtual #169                // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      39: astore        5
      41: iload_3
      42: istore_2
      43: iload_2
      44: istore_3
      45: aload         5
      47: invokeinterface #174,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      52: ifeq          111
      55: aload         5
      57: invokeinterface #178,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      62: checkcast     #180                // class java/lang/ref/WeakReference
      65: astore        6
      67: aload         6
      69: invokevirtual #182                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      72: checkcast     #162                // class android/support/v7/view/menu/o
      75: astore        7
      77: aload         7
      79: ifnonnull     95
      82: aload_0
      83: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      86: aload         6
      88: invokevirtual #185                // Method java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
      91: pop
      92: goto          43
      95: aload         7
      97: aload_0
      98: aload_1
      99: invokeinterface #563,  3          // InterfaceMethod android/support/v7/view/menu/o.b:(Landroid/support/v7/view/menu/h;Landroid/support/v7/view/menu/j;)Z
     104: istore_3
     105: iload_3
     106: istore_2
     107: iload_3
     108: ifeq          43
     111: aload_0
     112: invokevirtual #190                // Method h:()V
     115: iload_3
     116: istore_2
     117: iload_3
     118: ifeq          128
     121: aload_0
     122: aconst_null
     123: putfield      #544                // Field y:Landroid/support/v7/view/menu/j;
     126: iload_3
     127: istore_2
     128: iload_2
     129: ireturn

  public android.content.Context e();
    Code:
       0: aload_0
       1: getfield      #84                 // Field e:Landroid/content/Context;
       4: areturn

  protected android.support.v7.view.menu.h e(int);
    Code:
       0: aload_0
       1: iconst_0
       2: aconst_null
       3: iload_1
       4: aconst_null
       5: aconst_null
       6: invokespecial #260                // Method a:(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
       9: aload_0
      10: areturn

  public void f();
    Code:
       0: aload_0
       1: getfield      #318                // Field i:Landroid/support/v7/view/menu/h$a;
       4: ifnull        17
       7: aload_0
       8: getfield      #318                // Field i:Landroid/support/v7/view/menu/h$a;
      11: aload_0
      12: invokeinterface #566,  2          // InterfaceMethod android/support/v7/view/menu/h$a.a:(Landroid/support/v7/view/menu/h;)V
      17: return

  public android.view.MenuItem findItem(int);
    Code:
       0: aload_0
       1: invokevirtual #253                // Method size:()I
       4: istore_3
       5: iconst_0
       6: istore_2
       7: iload_2
       8: iload_3
       9: if_icmpge     73
      12: aload_0
      13: getfield      #94                 // Field j:Ljava/util/ArrayList;
      16: iload_2
      17: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      20: checkcast     #118                // class android/support/v7/view/menu/j
      23: astore        4
      25: aload         4
      27: invokevirtual #495                // Method android/support/v7/view/menu/j.getItemId:()I
      30: iload_1
      31: if_icmpne     37
      34: aload         4
      36: areturn
      37: aload         4
      39: invokevirtual #348                // Method android/support/v7/view/menu/j.hasSubMenu:()Z
      42: ifeq          66
      45: aload         4
      47: invokevirtual #352                // Method android/support/v7/view/menu/j.getSubMenu:()Landroid/view/SubMenu;
      50: iload_1
      51: invokeinterface #569,  2          // InterfaceMethod android/view/SubMenu.findItem:(I)Landroid/view/MenuItem;
      56: astore        4
      58: aload         4
      60: ifnull        66
      63: aload         4
      65: areturn
      66: iload_2
      67: iconst_1
      68: iadd
      69: istore_2
      70: goto          7
      73: aconst_null
      74: areturn

  public void g();
    Code:
       0: aload_0
       1: getfield      #64                 // Field r:Z
       4: ifne          22
       7: aload_0
       8: iconst_1
       9: putfield      #64                 // Field r:Z
      12: aload_0
      13: iconst_0
      14: putfield      #66                 // Field s:Z
      17: aload_0
      18: iconst_0
      19: putfield      #68                 // Field t:Z
      22: return

  public android.view.MenuItem getItem(int);
    Code:
       0: aload_0
       1: getfield      #94                 // Field j:Ljava/util/ArrayList;
       4: iload_1
       5: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
       8: checkcast     #334                // class android/view/MenuItem
      11: areturn

  public void h();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #64                 // Field r:Z
       5: aload_0
       6: getfield      #66                 // Field s:Z
       9: ifeq          25
      12: aload_0
      13: iconst_0
      14: putfield      #66                 // Field s:Z
      17: aload_0
      18: aload_0
      19: getfield      #68                 // Field t:Z
      22: invokevirtual #151                // Method a:(Z)V
      25: return

  public boolean hasVisibleItems();
    Code:
       0: aload_0
       1: getfield      #538                // Field z:Z
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: invokevirtual #253                // Method size:()I
      13: istore_2
      14: iconst_0
      15: istore_1
      16: iload_1
      17: iload_2
      18: if_icmpge     47
      21: aload_0
      22: getfield      #94                 // Field j:Ljava/util/ArrayList;
      25: iload_1
      26: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      29: checkcast     #118                // class android/support/v7/view/menu/j
      32: invokevirtual #573                // Method android/support/v7/view/menu/j.isVisible:()Z
      35: ifeq          40
      38: iconst_1
      39: ireturn
      40: iload_1
      41: iconst_1
      42: iadd
      43: istore_1
      44: goto          16
      47: iconst_0
      48: ireturn

  public java.util.ArrayList<android.support.v7.view.menu.j> i();
    Code:
       0: aload_0
       1: getfield      #98                 // Field l:Z
       4: ifne          12
       7: aload_0
       8: getfield      #96                 // Field k:Ljava/util/ArrayList;
      11: areturn
      12: aload_0
      13: getfield      #96                 // Field k:Ljava/util/ArrayList;
      16: invokevirtual #266                // Method java/util/ArrayList.clear:()V
      19: aload_0
      20: getfield      #94                 // Field j:Ljava/util/ArrayList;
      23: invokevirtual #112                // Method java/util/ArrayList.size:()I
      26: istore_2
      27: iconst_0
      28: istore_1
      29: iload_1
      30: iload_2
      31: if_icmpge     69
      34: aload_0
      35: getfield      #94                 // Field j:Ljava/util/ArrayList;
      38: iload_1
      39: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      42: checkcast     #118                // class android/support/v7/view/menu/j
      45: astore_3
      46: aload_3
      47: invokevirtual #573                // Method android/support/v7/view/menu/j.isVisible:()Z
      50: ifeq          62
      53: aload_0
      54: getfield      #96                 // Field k:Ljava/util/ArrayList;
      57: aload_3
      58: invokevirtual #575                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      61: pop
      62: iload_1
      63: iconst_1
      64: iadd
      65: istore_1
      66: goto          29
      69: aload_0
      70: iconst_0
      71: putfield      #98                 // Field l:Z
      74: aload_0
      75: iconst_1
      76: putfield      #104                // Field o:Z
      79: aload_0
      80: getfield      #96                 // Field k:Ljava/util/ArrayList;
      83: areturn

  public boolean isShortcutKey(int, android.view.KeyEvent);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokevirtual #580                // Method a:(ILandroid/view/KeyEvent;)Landroid/support/v7/view/menu/j;
       6: ifnull        11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public void j();
    Code:
       0: aload_0
       1: invokevirtual #582                // Method i:()Ljava/util/ArrayList;
       4: astore        4
       6: aload_0
       7: getfield      #104                // Field o:Z
      10: ifne          14
      13: return
      14: aload_0
      15: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      18: invokevirtual #169                // Method java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
      21: astore_3
      22: iconst_0
      23: istore_1
      24: aload_3
      25: invokeinterface #174,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      30: ifeq          85
      33: aload_3
      34: invokeinterface #178,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      39: checkcast     #180                // class java/lang/ref/WeakReference
      42: astore        5
      44: aload         5
      46: invokevirtual #182                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      49: checkcast     #162                // class android/support/v7/view/menu/o
      52: astore        6
      54: aload         6
      56: ifnonnull     72
      59: aload_0
      60: getfield      #82                 // Field x:Ljava/util/concurrent/CopyOnWriteArrayList;
      63: aload         5
      65: invokevirtual #185                // Method java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
      68: pop
      69: goto          24
      72: iload_1
      73: aload         6
      75: invokeinterface #584,  1          // InterfaceMethod android/support/v7/view/menu/o.a:()Z
      80: ior
      81: istore_1
      82: goto          24
      85: iload_1
      86: ifeq          165
      89: aload_0
      90: getfield      #100                // Field m:Ljava/util/ArrayList;
      93: invokevirtual #266                // Method java/util/ArrayList.clear:()V
      96: aload_0
      97: getfield      #102                // Field n:Ljava/util/ArrayList;
     100: invokevirtual #266                // Method java/util/ArrayList.clear:()V
     103: aload         4
     105: invokevirtual #112                // Method java/util/ArrayList.size:()I
     108: istore_2
     109: iconst_0
     110: istore_1
     111: iload_1
     112: iload_2
     113: if_icmpge     191
     116: aload         4
     118: iload_1
     119: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     122: checkcast     #118                // class android/support/v7/view/menu/j
     125: astore        5
     127: aload         5
     129: invokevirtual #586                // Method android/support/v7/view/menu/j.j:()Z
     132: ifeq          150
     135: aload_0
     136: getfield      #100                // Field m:Ljava/util/ArrayList;
     139: astore_3
     140: aload_3
     141: aload         5
     143: invokevirtual #575                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     146: pop
     147: goto          158
     150: aload_0
     151: getfield      #102                // Field n:Ljava/util/ArrayList;
     154: astore_3
     155: goto          140
     158: iload_1
     159: iconst_1
     160: iadd
     161: istore_1
     162: goto          111
     165: aload_0
     166: getfield      #100                // Field m:Ljava/util/ArrayList;
     169: invokevirtual #266                // Method java/util/ArrayList.clear:()V
     172: aload_0
     173: getfield      #102                // Field n:Ljava/util/ArrayList;
     176: invokevirtual #266                // Method java/util/ArrayList.clear:()V
     179: aload_0
     180: getfield      #102                // Field n:Ljava/util/ArrayList;
     183: aload_0
     184: invokevirtual #582                // Method i:()Ljava/util/ArrayList;
     187: invokevirtual #590                // Method java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
     190: pop
     191: aload_0
     192: iconst_0
     193: putfield      #104                // Field o:Z
     196: return

  public java.util.ArrayList<android.support.v7.view.menu.j> k();
    Code:
       0: aload_0
       1: invokevirtual #592                // Method j:()V
       4: aload_0
       5: getfield      #100                // Field m:Ljava/util/ArrayList;
       8: areturn

  public java.util.ArrayList<android.support.v7.view.menu.j> l();
    Code:
       0: aload_0
       1: invokevirtual #592                // Method j:()V
       4: aload_0
       5: getfield      #102                // Field n:Ljava/util/ArrayList;
       8: areturn

  public java.lang.CharSequence m();
    Code:
       0: aload_0
       1: getfield      #133                // Field a:Ljava/lang/CharSequence;
       4: areturn

  public android.graphics.drawable.Drawable n();
    Code:
       0: aload_0
       1: getfield      #135                // Field b:Landroid/graphics/drawable/Drawable;
       4: areturn

  public android.view.View o();
    Code:
       0: aload_0
       1: getfield      #131                // Field c:Landroid/view/View;
       4: areturn

  public android.support.v7.view.menu.h p();
    Code:
       0: aload_0
       1: areturn

  public boolean performIdentifierAction(int, int);
    Code:
       0: aload_0
       1: aload_0
       2: iload_1
       3: invokevirtual #560                // Method findItem:(I)Landroid/view/MenuItem;
       6: iload_2
       7: invokevirtual #599                // Method a:(Landroid/view/MenuItem;I)Z
      10: ireturn

  public boolean performShortcut(int, android.view.KeyEvent, int);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokevirtual #580                // Method a:(ILandroid/view/KeyEvent;)Landroid/support/v7/view/menu/j;
       6: astore_2
       7: aload_2
       8: ifnull        22
      11: aload_0
      12: aload_2
      13: iload_3
      14: invokevirtual #599                // Method a:(Landroid/view/MenuItem;I)Z
      17: istore        4
      19: goto          25
      22: iconst_0
      23: istore        4
      25: iload_3
      26: iconst_2
      27: iand
      28: ifeq          36
      31: aload_0
      32: iconst_1
      33: invokevirtual #389                // Method b:(Z)V
      36: iload         4
      38: ireturn

  boolean q();
    Code:
       0: aload_0
       1: getfield      #70                 // Field u:Z
       4: ireturn

  public android.support.v7.view.menu.j r();
    Code:
       0: aload_0
       1: getfield      #544                // Field y:Landroid/support/v7/view/menu/j;
       4: areturn

  public void removeGroup(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #604                // Method c:(I)I
       5: istore_3
       6: iload_3
       7: iflt          65
      10: aload_0
      11: getfield      #94                 // Field j:Ljava/util/ArrayList;
      14: invokevirtual #112                // Method java/util/ArrayList.size:()I
      17: istore        4
      19: iconst_0
      20: istore_2
      21: iload_2
      22: iload         4
      24: iload_3
      25: isub
      26: if_icmpge     60
      29: aload_0
      30: getfield      #94                 // Field j:Ljava/util/ArrayList;
      33: iload_3
      34: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      37: checkcast     #118                // class android/support/v7/view/menu/j
      40: invokevirtual #256                // Method android/support/v7/view/menu/j.getGroupId:()I
      43: iload_1
      44: if_icmpne     60
      47: aload_0
      48: iload_3
      49: iconst_0
      50: invokespecial #606                // Method a:(IZ)V
      53: iload_2
      54: iconst_1
      55: iadd
      56: istore_2
      57: goto          21
      60: aload_0
      61: iconst_1
      62: invokevirtual #151                // Method a:(Z)V
      65: return

  public void removeItem(int);
    Code:
       0: aload_0
       1: aload_0
       2: iload_1
       3: invokevirtual #609                // Method b:(I)I
       6: iconst_1
       7: invokespecial #606                // Method a:(IZ)V
      10: return

  public void setGroupCheckable(int, boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #94                 // Field j:Ljava/util/ArrayList;
       4: invokevirtual #112                // Method java/util/ArrayList.size:()I
       7: istore        5
       9: iconst_0
      10: istore        4
      12: iload         4
      14: iload         5
      16: if_icmpge     64
      19: aload_0
      20: getfield      #94                 // Field j:Ljava/util/ArrayList;
      23: iload         4
      25: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #118                // class android/support/v7/view/menu/j
      31: astore        6
      33: aload         6
      35: invokevirtual #256                // Method android/support/v7/view/menu/j.getGroupId:()I
      38: iload_1
      39: if_icmpne     55
      42: aload         6
      44: iload_3
      45: invokevirtual #612                // Method android/support/v7/view/menu/j.a:(Z)V
      48: aload         6
      50: iload_2
      51: invokevirtual #616                // Method android/support/v7/view/menu/j.setCheckable:(Z)Landroid/view/MenuItem;
      54: pop
      55: iload         4
      57: iconst_1
      58: iadd
      59: istore        4
      61: goto          12
      64: return

  public void setGroupEnabled(int, boolean);
    Code:
       0: aload_0
       1: getfield      #94                 // Field j:Ljava/util/ArrayList;
       4: invokevirtual #112                // Method java/util/ArrayList.size:()I
       7: istore        4
       9: iconst_0
      10: istore_3
      11: iload_3
      12: iload         4
      14: if_icmpge     53
      17: aload_0
      18: getfield      #94                 // Field j:Ljava/util/ArrayList;
      21: iload_3
      22: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      25: checkcast     #118                // class android/support/v7/view/menu/j
      28: astore        5
      30: aload         5
      32: invokevirtual #256                // Method android/support/v7/view/menu/j.getGroupId:()I
      35: iload_1
      36: if_icmpne     46
      39: aload         5
      41: iload_2
      42: invokevirtual #620                // Method android/support/v7/view/menu/j.setEnabled:(Z)Landroid/view/MenuItem;
      45: pop
      46: iload_3
      47: iconst_1
      48: iadd
      49: istore_3
      50: goto          11
      53: return

  public void setGroupVisible(int, boolean);
    Code:
       0: aload_0
       1: getfield      #94                 // Field j:Ljava/util/ArrayList;
       4: invokevirtual #112                // Method java/util/ArrayList.size:()I
       7: istore        6
       9: iconst_0
      10: istore_3
      11: iconst_0
      12: istore        4
      14: iload_3
      15: iload         6
      17: if_icmpge     73
      20: aload_0
      21: getfield      #94                 // Field j:Ljava/util/ArrayList;
      24: iload_3
      25: invokevirtual #116                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #118                // class android/support/v7/view/menu/j
      31: astore        7
      33: iload         4
      35: istore        5
      37: aload         7
      39: invokevirtual #256                // Method android/support/v7/view/menu/j.getGroupId:()I
      42: iload_1
      43: if_icmpne     62
      46: iload         4
      48: istore        5
      50: aload         7
      52: iload_2
      53: invokevirtual #624                // Method android/support/v7/view/menu/j.c:(Z)Z
      56: ifeq          62
      59: iconst_1
      60: istore        5
      62: iload_3
      63: iconst_1
      64: iadd
      65: istore_3
      66: iload         5
      68: istore        4
      70: goto          14
      73: iload         4
      75: ifeq          83
      78: aload_0
      79: iconst_1
      80: invokevirtual #151                // Method a:(Z)V
      83: return

  public void setQwertyMode(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #502                // Field g:Z
       5: aload_0
       6: iconst_0
       7: invokevirtual #151                // Method a:(Z)V
      10: return

  public int size();
    Code:
       0: aload_0
       1: getfield      #94                 // Field j:Ljava/util/ArrayList;
       4: invokevirtual #112                // Method java/util/ArrayList.size:()I
       7: ireturn
}
