class android.support.v7.widget.ActivityChooserView$a extends android.widget.BaseAdapter {
  final android.support.v7.widget.ActivityChooserView a;

  public int a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field c:I
       4: istore_3
       5: aload_0
       6: ldc           #20                 // int 2147483647
       8: putfield      #19                 // Field c:I
      11: iconst_0
      12: istore_1
      13: iconst_0
      14: iconst_0
      15: invokestatic  #26                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      18: istore        4
      20: iconst_0
      21: iconst_0
      22: invokestatic  #26                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      25: istore        5
      27: aload_0
      28: invokevirtual #29                 // Method getCount:()I
      31: istore        6
      33: aconst_null
      34: astore        7
      36: iconst_0
      37: istore_2
      38: iload_1
      39: iload         6
      41: if_icmpge     80
      44: aload_0
      45: iload_1
      46: aload         7
      48: aconst_null
      49: invokevirtual #33                 // Method getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
      52: astore        7
      54: aload         7
      56: iload         4
      58: iload         5
      60: invokevirtual #39                 // Method android/view/View.measure:(II)V
      63: iload_2
      64: aload         7
      66: invokevirtual #42                 // Method android/view/View.getMeasuredWidth:()I
      69: invokestatic  #47                 // Method java/lang/Math.max:(II)I
      72: istore_2
      73: iload_1
      74: iconst_1
      75: iadd
      76: istore_1
      77: goto          38
      80: aload_0
      81: iload_3
      82: putfield      #19                 // Field c:I
      85: iload_2
      86: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #19                 // Field c:I
       4: iload_1
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #19                 // Field c:I
      13: aload_0
      14: invokevirtual #53                 // Method notifyDataSetChanged:()V
      17: return

  public void a(android.support.v7.widget.e);
    Code:
       0: aload_0
       1: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
       4: getfield      #59                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
       7: invokevirtual #62                 // Method d:()Landroid/support/v7/widget/e;
      10: astore_2
      11: aload_2
      12: ifnull        36
      15: aload_0
      16: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      19: invokevirtual #66                 // Method android/support/v7/widget/ActivityChooserView.isShown:()Z
      22: ifeq          36
      25: aload_2
      26: aload_0
      27: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      30: getfield      #69                 // Field android/support/v7/widget/ActivityChooserView.e:Landroid/database/DataSetObserver;
      33: invokevirtual #75                 // Method android/support/v7/widget/e.unregisterObserver:(Ljava/lang/Object;)V
      36: aload_0
      37: aload_1
      38: putfield      #77                 // Field b:Landroid/support/v7/widget/e;
      41: aload_1
      42: ifnull        66
      45: aload_0
      46: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      49: invokevirtual #66                 // Method android/support/v7/widget/ActivityChooserView.isShown:()Z
      52: ifeq          66
      55: aload_1
      56: aload_0
      57: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      60: getfield      #69                 // Field android/support/v7/widget/ActivityChooserView.e:Landroid/database/DataSetObserver;
      63: invokevirtual #80                 // Method android/support/v7/widget/e.registerObserver:(Ljava/lang/Object;)V
      66: aload_0
      67: invokevirtual #53                 // Method notifyDataSetChanged:()V
      70: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #83                 // Field f:Z
       4: iload_1
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #83                 // Field f:Z
      13: aload_0
      14: invokevirtual #53                 // Method notifyDataSetChanged:()V
      17: return

  public void a(boolean, boolean);
    Code:
       0: aload_0
       1: getfield      #86                 // Field d:Z
       4: iload_1
       5: if_icmpne     16
       8: aload_0
       9: getfield      #88                 // Field e:Z
      12: iload_2
      13: if_icmpeq     30
      16: aload_0
      17: iload_1
      18: putfield      #86                 // Field d:Z
      21: aload_0
      22: iload_2
      23: putfield      #88                 // Field e:Z
      26: aload_0
      27: invokevirtual #53                 // Method notifyDataSetChanged:()V
      30: return

  public android.content.pm.ResolveInfo b();
    Code:
       0: aload_0
       1: getfield      #77                 // Field b:Landroid/support/v7/widget/e;
       4: invokevirtual #91                 // Method android/support/v7/widget/e.b:()Landroid/content/pm/ResolveInfo;
       7: areturn

  public int c();
    Code:
       0: aload_0
       1: getfield      #77                 // Field b:Landroid/support/v7/widget/e;
       4: invokevirtual #93                 // Method android/support/v7/widget/e.a:()I
       7: ireturn

  public android.support.v7.widget.e d();
    Code:
       0: aload_0
       1: getfield      #77                 // Field b:Landroid/support/v7/widget/e;
       4: areturn

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #86                 // Field d:Z
       4: ireturn

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #77                 // Field b:Landroid/support/v7/widget/e;
       4: invokevirtual #93                 // Method android/support/v7/widget/e.a:()I
       7: istore_2
       8: iload_2
       9: istore_1
      10: aload_0
      11: getfield      #86                 // Field d:Z
      14: ifne          33
      17: iload_2
      18: istore_1
      19: aload_0
      20: getfield      #77                 // Field b:Landroid/support/v7/widget/e;
      23: invokevirtual #91                 // Method android/support/v7/widget/e.b:()Landroid/content/pm/ResolveInfo;
      26: ifnull        33
      29: iload_2
      30: iconst_1
      31: isub
      32: istore_1
      33: iload_1
      34: aload_0
      35: getfield      #19                 // Field c:I
      38: invokestatic  #96                 // Method java/lang/Math.min:(II)I
      41: istore_2
      42: iload_2
      43: istore_1
      44: aload_0
      45: getfield      #83                 // Field f:Z
      48: ifeq          55
      51: iload_2
      52: iconst_1
      53: iadd
      54: istore_1
      55: iload_1
      56: ireturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #102                // Method getItemViewType:(I)I
       5: tableswitch   { // 0 to 1
                     0: 38
                     1: 36
               default: 28
          }
      28: new           #104                // class java/lang/IllegalArgumentException
      31: dup
      32: invokespecial #107                // Method java/lang/IllegalArgumentException."<init>":()V
      35: athrow
      36: aconst_null
      37: areturn
      38: iload_1
      39: istore_2
      40: aload_0
      41: getfield      #86                 // Field d:Z
      44: ifne          63
      47: iload_1
      48: istore_2
      49: aload_0
      50: getfield      #77                 // Field b:Landroid/support/v7/widget/e;
      53: invokevirtual #91                 // Method android/support/v7/widget/e.b:()Landroid/content/pm/ResolveInfo;
      56: ifnull        63
      59: iload_1
      60: iconst_1
      61: iadd
      62: istore_2
      63: aload_0
      64: getfield      #77                 // Field b:Landroid/support/v7/widget/e;
      67: iload_2
      68: invokevirtual #110                // Method android/support/v7/widget/e.a:(I)Landroid/content/pm/ResolveInfo;
      71: areturn

  public long getItemId(int);
    Code:
       0: iload_1
       1: i2l
       2: lreturn

  public int getItemViewType(int);
    Code:
       0: aload_0
       1: getfield      #83                 // Field f:Z
       4: ifeq          19
       7: iload_1
       8: aload_0
       9: invokevirtual #29                 // Method getCount:()I
      12: iconst_1
      13: isub
      14: if_icmpne     19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #102                // Method getItemViewType:(I)I
       5: tableswitch   { // 0 to 1
                     0: 107
                     1: 36
               default: 28
          }
      28: new           #104                // class java/lang/IllegalArgumentException
      31: dup
      32: invokespecial #107                // Method java/lang/IllegalArgumentException."<init>":()V
      35: athrow
      36: aload_2
      37: ifnull        51
      40: aload_2
      41: astore        4
      43: aload_2
      44: invokevirtual #115                // Method android/view/View.getId:()I
      47: iconst_1
      48: if_icmpeq     104
      51: aload_0
      52: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      55: invokevirtual #119                // Method android/support/v7/widget/ActivityChooserView.getContext:()Landroid/content/Context;
      58: invokestatic  #125                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      61: getstatic     #130                // Field android/support/v7/a/a$g.abc_activity_chooser_view_list_item:I
      64: aload_3
      65: iconst_0
      66: invokevirtual #134                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      69: astore        4
      71: aload         4
      73: iconst_1
      74: invokevirtual #137                // Method android/view/View.setId:(I)V
      77: aload         4
      79: getstatic     #142                // Field android/support/v7/a/a$f.title:I
      82: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
      85: checkcast     #148                // class android/widget/TextView
      88: aload_0
      89: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      92: invokevirtual #119                // Method android/support/v7/widget/ActivityChooserView.getContext:()Landroid/content/Context;
      95: getstatic     #153                // Field android/support/v7/a/a$h.abc_activity_chooser_view_see_all:I
      98: invokevirtual #159                // Method android/content/Context.getString:(I)Ljava/lang/String;
     101: invokevirtual #163                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     104: aload         4
     106: areturn
     107: aload_2
     108: ifnull        124
     111: aload_2
     112: astore        4
     114: aload_2
     115: invokevirtual #115                // Method android/view/View.getId:()I
     118: getstatic     #166                // Field android/support/v7/a/a$f.list_item:I
     121: if_icmpeq     144
     124: aload_0
     125: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
     128: invokevirtual #119                // Method android/support/v7/widget/ActivityChooserView.getContext:()Landroid/content/Context;
     131: invokestatic  #125                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
     134: getstatic     #130                // Field android/support/v7/a/a$g.abc_activity_chooser_view_list_item:I
     137: aload_3
     138: iconst_0
     139: invokevirtual #134                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
     142: astore        4
     144: aload_0
     145: getfield      #56                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
     148: invokevirtual #119                // Method android/support/v7/widget/ActivityChooserView.getContext:()Landroid/content/Context;
     151: invokevirtual #170                // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
     154: astore_2
     155: aload         4
     157: getstatic     #173                // Field android/support/v7/a/a$f.icon:I
     160: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
     163: checkcast     #175                // class android/widget/ImageView
     166: astore_3
     167: aload_0
     168: iload_1
     169: invokevirtual #177                // Method getItem:(I)Ljava/lang/Object;
     172: checkcast     #179                // class android/content/pm/ResolveInfo
     175: astore        5
     177: aload_3
     178: aload         5
     180: aload_2
     181: invokevirtual #183                // Method android/content/pm/ResolveInfo.loadIcon:(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
     184: invokevirtual #187                // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
     187: aload         4
     189: getstatic     #142                // Field android/support/v7/a/a$f.title:I
     192: invokevirtual #146                // Method android/view/View.findViewById:(I)Landroid/view/View;
     195: checkcast     #148                // class android/widget/TextView
     198: aload         5
     200: aload_2
     201: invokevirtual #191                // Method android/content/pm/ResolveInfo.loadLabel:(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
     204: invokevirtual #163                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     207: aload_0
     208: getfield      #86                 // Field d:Z
     211: ifeq          234
     214: iload_1
     215: ifne          234
     218: aload_0
     219: getfield      #88                 // Field e:Z
     222: ifeq          234
     225: aload         4
     227: iconst_1
     228: invokevirtual #194                // Method android/view/View.setActivated:(Z)V
     231: aload         4
     233: areturn
     234: aload         4
     236: iconst_0
     237: invokevirtual #194                // Method android/view/View.setActivated:(Z)V
     240: aload         4
     242: areturn

  public int getViewTypeCount();
    Code:
       0: iconst_3
       1: ireturn
}
