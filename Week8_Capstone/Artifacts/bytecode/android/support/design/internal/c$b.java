class android.support.design.internal.c$b extends android.support.v7.widget.RecyclerView$a<android.support.design.internal.c$j> {
  final android.support.design.internal.c a;

  android.support.design.internal.c$b(android.support.design.internal.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field a:Landroid/support/design/internal/c;
       5: aload_0
       6: invokespecial #23                 // Method android/support/v7/widget/RecyclerView$a."<init>":()V
       9: aload_0
      10: new           #25                 // class java/util/ArrayList
      13: dup
      14: invokespecial #26                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #28                 // Field b:Ljava/util/ArrayList;
      20: aload_0
      21: invokespecial #31                 // Method f:()V
      24: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #66                 // Method java/util/ArrayList.size:()I
       7: ireturn

  public long a(int);
    Code:
       0: iload_1
       1: i2l
       2: lreturn

  public android.support.design.internal.c$j a(android.view.ViewGroup, int);
    Code:
       0: iload_2
       1: tableswitch   { // 0 to 3
                     0: 81
                     1: 65
                     2: 49
                     3: 34
               default: 32
          }
      32: aconst_null
      33: areturn
      34: new           #124                // class android/support/design/internal/c$a
      37: dup
      38: aload_0
      39: getfield      #20                 // Field a:Landroid/support/design/internal/c;
      42: getfield      #127                // Field android/support/design/internal/c.a:Landroid/widget/LinearLayout;
      45: invokespecial #130                // Method android/support/design/internal/c$a."<init>":(Landroid/view/View;)V
      48: areturn
      49: new           #132                // class android/support/design/internal/c$h
      52: dup
      53: aload_0
      54: getfield      #20                 // Field a:Landroid/support/design/internal/c;
      57: getfield      #135                // Field android/support/design/internal/c.d:Landroid/view/LayoutInflater;
      60: aload_1
      61: invokespecial #138                // Method android/support/design/internal/c$h."<init>":(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
      64: areturn
      65: new           #140                // class android/support/design/internal/c$i
      68: dup
      69: aload_0
      70: getfield      #20                 // Field a:Landroid/support/design/internal/c;
      73: getfield      #135                // Field android/support/design/internal/c.d:Landroid/view/LayoutInflater;
      76: aload_1
      77: invokespecial #141                // Method android/support/design/internal/c$i."<init>":(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
      80: areturn
      81: new           #143                // class android/support/design/internal/c$g
      84: dup
      85: aload_0
      86: getfield      #20                 // Field a:Landroid/support/design/internal/c;
      89: getfield      #135                // Field android/support/design/internal/c.d:Landroid/view/LayoutInflater;
      92: aload_1
      93: aload_0
      94: getfield      #20                 // Field a:Landroid/support/design/internal/c;
      97: getfield      #147                // Field android/support/design/internal/c.k:Landroid/view/View$OnClickListener;
     100: invokespecial #150                // Method android/support/design/internal/c$g."<init>":(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/view/View$OnClickListener;)V
     103: areturn

  public void a(android.os.Bundle);
    Code:
       0: iconst_0
       1: istore_3
       2: aload_1
       3: ldc           #153                // String android:menu:checked
       5: iconst_0
       6: invokevirtual #159                // Method android/os/Bundle.getInt:(Ljava/lang/String;I)I
       9: istore        4
      11: iload         4
      13: ifeq          109
      16: aload_0
      17: iconst_1
      18: putfield      #43                 // Field d:Z
      21: aload_0
      22: getfield      #28                 // Field b:Ljava/util/ArrayList;
      25: invokevirtual #66                 // Method java/util/ArrayList.size:()I
      28: istore        5
      30: iconst_0
      31: istore_2
      32: iload_2
      33: iload         5
      35: if_icmpge     100
      38: aload_0
      39: getfield      #28                 // Field b:Ljava/util/ArrayList;
      42: iload_2
      43: invokevirtual #37                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      46: checkcast     #161                // class android/support/design/internal/c$d
      49: astore        6
      51: aload         6
      53: instanceof    #39                 // class android/support/design/internal/c$f
      56: ifeq          93
      59: aload         6
      61: checkcast     #39                 // class android/support/design/internal/c$f
      64: invokevirtual #164                // Method android/support/design/internal/c$f.a:()Landroid/support/v7/view/menu/j;
      67: astore        6
      69: aload         6
      71: ifnull        93
      74: aload         6
      76: invokevirtual #167                // Method android/support/v7/view/menu/j.getItemId:()I
      79: iload         4
      81: if_icmpne     93
      84: aload_0
      85: aload         6
      87: invokevirtual #75                 // Method a:(Landroid/support/v7/view/menu/j;)V
      90: goto          100
      93: iload_2
      94: iconst_1
      95: iadd
      96: istore_2
      97: goto          32
     100: aload_0
     101: iconst_0
     102: putfield      #43                 // Field d:Z
     105: aload_0
     106: invokespecial #31                 // Method f:()V
     109: aload_1
     110: ldc           #169                // String android:menu:action_views
     112: invokevirtual #173                // Method android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
     115: astore_1
     116: aload_1
     117: ifnull        230
     120: aload_0
     121: getfield      #28                 // Field b:Ljava/util/ArrayList;
     124: invokevirtual #66                 // Method java/util/ArrayList.size:()I
     127: istore        4
     129: iload_3
     130: istore_2
     131: iload_2
     132: iload         4
     134: if_icmpge     230
     137: aload_0
     138: getfield      #28                 // Field b:Ljava/util/ArrayList;
     141: iload_2
     142: invokevirtual #37                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     145: checkcast     #161                // class android/support/design/internal/c$d
     148: astore        6
     150: aload         6
     152: instanceof    #39                 // class android/support/design/internal/c$f
     155: ifne          161
     158: goto          223
     161: aload         6
     163: checkcast     #39                 // class android/support/design/internal/c$f
     166: invokevirtual #164                // Method android/support/design/internal/c$f.a:()Landroid/support/v7/view/menu/j;
     169: astore        7
     171: aload         7
     173: ifnonnull     179
     176: goto          223
     179: aload         7
     181: invokevirtual #177                // Method android/support/v7/view/menu/j.getActionView:()Landroid/view/View;
     184: astore        6
     186: aload         6
     188: ifnonnull     194
     191: goto          223
     194: aload_1
     195: aload         7
     197: invokevirtual #167                // Method android/support/v7/view/menu/j.getItemId:()I
     200: invokevirtual #180                // Method android/util/SparseArray.get:(I)Ljava/lang/Object;
     203: checkcast     #182                // class android/support/design/internal/e
     206: astore        7
     208: aload         7
     210: ifnonnull     216
     213: goto          223
     216: aload         6
     218: aload         7
     220: invokevirtual #188                // Method android/view/View.restoreHierarchyState:(Landroid/util/SparseArray;)V
     223: iload_2
     224: iconst_1
     225: iadd
     226: istore_2
     227: goto          131
     230: return

  public void a(android.support.design.internal.c$j);
    Code:
       0: aload_1
       1: instanceof    #143                // class android/support/design/internal/c$g
       4: ifeq          17
       7: aload_1
       8: getfield      #194                // Field android/support/design/internal/c$j.a:Landroid/view/View;
      11: checkcast     #196                // class android/support/design/internal/NavigationMenuItemView
      14: invokevirtual #198                // Method android/support/design/internal/NavigationMenuItemView.a:()V
      17: return

  public void a(android.support.design.internal.c$j, int);
    Code:
       0: aload_0
       1: iload_2
       2: invokevirtual #202                // Method b:(I)I
       5: tableswitch   { // 0 to 2
                     0: 91
                     1: 63
                     2: 33
               default: 32
          }
      32: return
      33: aload_0
      34: getfield      #28                 // Field b:Ljava/util/ArrayList;
      37: iload_2
      38: invokevirtual #37                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      41: checkcast     #95                 // class android/support/design/internal/c$e
      44: astore_3
      45: aload_1
      46: getfield      #194                // Field android/support/design/internal/c$j.a:Landroid/view/View;
      49: iconst_0
      50: aload_3
      51: invokevirtual #204                // Method android/support/design/internal/c$e.a:()I
      54: iconst_0
      55: aload_3
      56: invokevirtual #206                // Method android/support/design/internal/c$e.b:()I
      59: invokevirtual #210                // Method android/view/View.setPadding:(IIII)V
      62: return
      63: aload_1
      64: getfield      #194                // Field android/support/design/internal/c$j.a:Landroid/view/View;
      67: checkcast     #212                // class android/widget/TextView
      70: aload_0
      71: getfield      #28                 // Field b:Ljava/util/ArrayList;
      74: iload_2
      75: invokevirtual #37                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      78: checkcast     #39                 // class android/support/design/internal/c$f
      81: invokevirtual #164                // Method android/support/design/internal/c$f.a:()Landroid/support/v7/view/menu/j;
      84: invokevirtual #216                // Method android/support/v7/view/menu/j.getTitle:()Ljava/lang/CharSequence;
      87: invokevirtual #220                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      90: return
      91: aload_1
      92: getfield      #194                // Field android/support/design/internal/c$j.a:Landroid/view/View;
      95: checkcast     #196                // class android/support/design/internal/NavigationMenuItemView
      98: astore_3
      99: aload_3
     100: aload_0
     101: getfield      #20                 // Field a:Landroid/support/design/internal/c;
     104: getfield      #224                // Field android/support/design/internal/c.h:Landroid/content/res/ColorStateList;
     107: invokevirtual #228                // Method android/support/design/internal/NavigationMenuItemView.setIconTintList:(Landroid/content/res/ColorStateList;)V
     110: aload_0
     111: getfield      #20                 // Field a:Landroid/support/design/internal/c;
     114: getfield      #230                // Field android/support/design/internal/c.f:Z
     117: ifeq          131
     120: aload_3
     121: aload_0
     122: getfield      #20                 // Field a:Landroid/support/design/internal/c;
     125: getfield      #233                // Field android/support/design/internal/c.e:I
     128: invokevirtual #237                // Method android/support/design/internal/NavigationMenuItemView.setTextAppearance:(I)V
     131: aload_0
     132: getfield      #20                 // Field a:Landroid/support/design/internal/c;
     135: getfield      #240                // Field android/support/design/internal/c.g:Landroid/content/res/ColorStateList;
     138: ifnull        152
     141: aload_3
     142: aload_0
     143: getfield      #20                 // Field a:Landroid/support/design/internal/c;
     146: getfield      #240                // Field android/support/design/internal/c.g:Landroid/content/res/ColorStateList;
     149: invokevirtual #243                // Method android/support/design/internal/NavigationMenuItemView.setTextColor:(Landroid/content/res/ColorStateList;)V
     152: aload_0
     153: getfield      #20                 // Field a:Landroid/support/design/internal/c;
     156: getfield      #246                // Field android/support/design/internal/c.i:Landroid/graphics/drawable/Drawable;
     159: ifnull        179
     162: aload_0
     163: getfield      #20                 // Field a:Landroid/support/design/internal/c;
     166: getfield      #246                // Field android/support/design/internal/c.i:Landroid/graphics/drawable/Drawable;
     169: invokevirtual #252                // Method android/graphics/drawable/Drawable.getConstantState:()Landroid/graphics/drawable/Drawable$ConstantState;
     172: invokevirtual #257                // Method android/graphics/drawable/Drawable$ConstantState.newDrawable:()Landroid/graphics/drawable/Drawable;
     175: astore_1
     176: goto          181
     179: aconst_null
     180: astore_1
     181: aload_3
     182: aload_1
     183: invokestatic  #262                // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
     186: aload_0
     187: getfield      #28                 // Field b:Ljava/util/ArrayList;
     190: iload_2
     191: invokevirtual #37                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
     194: checkcast     #39                 // class android/support/design/internal/c$f
     197: astore_1
     198: aload_3
     199: aload_1
     200: getfield      #41                 // Field android/support/design/internal/c$f.a:Z
     203: invokevirtual #265                // Method android/support/design/internal/NavigationMenuItemView.setNeedsEmptyIcon:(Z)V
     206: aload_3
     207: aload_1
     208: invokevirtual #164                // Method android/support/design/internal/c$f.a:()Landroid/support/v7/view/menu/j;
     211: iconst_0
     212: invokevirtual #268                // Method android/support/design/internal/NavigationMenuItemView.a:(Landroid/support/v7/view/menu/j;I)V
     215: return

  public void a(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #270                // Field c:Landroid/support/v7/view/menu/j;
       4: aload_1
       5: if_acmpeq     43
       8: aload_1
       9: invokevirtual #78                 // Method android/support/v7/view/menu/j.isCheckable:()Z
      12: ifne          16
      15: return
      16: aload_0
      17: getfield      #270                // Field c:Landroid/support/v7/view/menu/j;
      20: ifnull        32
      23: aload_0
      24: getfield      #270                // Field c:Landroid/support/v7/view/menu/j;
      27: iconst_0
      28: invokevirtual #274                // Method android/support/v7/view/menu/j.setChecked:(Z)Landroid/view/MenuItem;
      31: pop
      32: aload_0
      33: aload_1
      34: putfield      #270                // Field c:Landroid/support/v7/view/menu/j;
      37: aload_1
      38: iconst_1
      39: invokevirtual #274                // Method android/support/v7/view/menu/j.setChecked:(Z)Landroid/view/MenuItem;
      42: pop
      43: return

  public void a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #191                // class android/support/design/internal/c$j
       5: invokevirtual #277                // Method a:(Landroid/support/design/internal/c$j;)V
       8: return

  public void a(android.support.v7.widget.RecyclerView$x, int);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #191                // class android/support/design/internal/c$j
       5: iload_2
       6: invokevirtual #280                // Method a:(Landroid/support/design/internal/c$j;I)V
       9: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #43                 // Field d:Z
       5: return

  public int b(int);
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:Ljava/util/ArrayList;
       4: iload_1
       5: invokevirtual #37                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
       8: checkcast     #161                // class android/support/design/internal/c$d
      11: astore_2
      12: aload_2
      13: instanceof    #95                 // class android/support/design/internal/c$e
      16: ifeq          21
      19: iconst_2
      20: ireturn
      21: aload_2
      22: instanceof    #48                 // class android/support/design/internal/c$c
      25: ifeq          30
      28: iconst_3
      29: ireturn
      30: aload_2
      31: instanceof    #39                 // class android/support/design/internal/c$f
      34: ifeq          54
      37: aload_2
      38: checkcast     #39                 // class android/support/design/internal/c$f
      41: invokevirtual #164                // Method android/support/design/internal/c$f.a:()Landroid/support/v7/view/menu/j;
      44: invokevirtual #84                 // Method android/support/v7/view/menu/j.hasSubMenu:()Z
      47: ifeq          52
      50: iconst_1
      51: ireturn
      52: iconst_0
      53: ireturn
      54: new           #282                // class java/lang/RuntimeException
      57: dup
      58: ldc_w         #284                // String Unknown item type.
      61: invokespecial #287                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      64: athrow

  public android.support.v7.widget.RecyclerView$x b(android.view.ViewGroup, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokevirtual #290                // Method a:(Landroid/view/ViewGroup;I)Landroid/support/design/internal/c$j;
       6: areturn

  public void b();
    Code:
       0: aload_0
       1: invokespecial #31                 // Method f:()V
       4: aload_0
       5: invokevirtual #292                // Method e:()V
       8: return

  public android.os.Bundle c();
    Code:
       0: new           #155                // class android/os/Bundle
       3: dup
       4: invokespecial #294                // Method android/os/Bundle."<init>":()V
       7: astore        4
       9: aload_0
      10: getfield      #270                // Field c:Landroid/support/v7/view/menu/j;
      13: ifnull        30
      16: aload         4
      18: ldc           #153                // String android:menu:checked
      20: aload_0
      21: getfield      #270                // Field c:Landroid/support/v7/view/menu/j;
      24: invokevirtual #167                // Method android/support/v7/view/menu/j.getItemId:()I
      27: invokevirtual #298                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      30: new           #179                // class android/util/SparseArray
      33: dup
      34: invokespecial #299                // Method android/util/SparseArray."<init>":()V
      37: astore        5
      39: iconst_0
      40: istore_1
      41: aload_0
      42: getfield      #28                 // Field b:Ljava/util/ArrayList;
      45: invokevirtual #66                 // Method java/util/ArrayList.size:()I
      48: istore_2
      49: iload_1
      50: iload_2
      51: if_icmpge     136
      54: aload_0
      55: getfield      #28                 // Field b:Ljava/util/ArrayList;
      58: iload_1
      59: invokevirtual #37                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      62: checkcast     #161                // class android/support/design/internal/c$d
      65: astore_3
      66: aload_3
      67: instanceof    #39                 // class android/support/design/internal/c$f
      70: ifeq          129
      73: aload_3
      74: checkcast     #39                 // class android/support/design/internal/c$f
      77: invokevirtual #164                // Method android/support/design/internal/c$f.a:()Landroid/support/v7/view/menu/j;
      80: astore        6
      82: aload         6
      84: ifnull        96
      87: aload         6
      89: invokevirtual #177                // Method android/support/v7/view/menu/j.getActionView:()Landroid/view/View;
      92: astore_3
      93: goto          98
      96: aconst_null
      97: astore_3
      98: aload_3
      99: ifnull        129
     102: new           #182                // class android/support/design/internal/e
     105: dup
     106: invokespecial #300                // Method android/support/design/internal/e."<init>":()V
     109: astore        7
     111: aload_3
     112: aload         7
     114: invokevirtual #303                // Method android/view/View.saveHierarchyState:(Landroid/util/SparseArray;)V
     117: aload         5
     119: aload         6
     121: invokevirtual #167                // Method android/support/v7/view/menu/j.getItemId:()I
     124: aload         7
     126: invokevirtual #307                // Method android/util/SparseArray.put:(ILjava/lang/Object;)V
     129: iload_1
     130: iconst_1
     131: iadd
     132: istore_1
     133: goto          49
     136: aload         4
     138: ldc           #169                // String android:menu:action_views
     140: aload         5
     142: invokevirtual #311                // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
     145: aload         4
     147: areturn
}
