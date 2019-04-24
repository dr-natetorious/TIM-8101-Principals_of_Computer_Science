class se.emilsjolander.stickylistheaders.a extends android.widget.BaseAdapter implements se.emilsjolander.stickylistheaders.e {
  se.emilsjolander.stickylistheaders.e a;

  se.emilsjolander.stickylistheaders.a(android.content.Context, se.emilsjolander.stickylistheaders.e);
    Code:
       0: aload_0
       1: invokespecial #32                 // Method android/widget/BaseAdapter."<init>":()V
       4: aload_0
       5: new           #34                 // class java/util/LinkedList
       8: dup
       9: invokespecial #35                 // Method java/util/LinkedList."<init>":()V
      12: putfield      #37                 // Field b:Ljava/util/List;
      15: aload_0
      16: new           #8                  // class se/emilsjolander/stickylistheaders/a$1
      19: dup
      20: aload_0
      21: invokespecial #40                 // Method se/emilsjolander/stickylistheaders/a$1."<init>":(Lse/emilsjolander/stickylistheaders/a;)V
      24: putfield      #42                 // Field g:Landroid/database/DataSetObserver;
      27: aload_0
      28: aload_1
      29: putfield      #44                 // Field c:Landroid/content/Context;
      32: aload_0
      33: aload_2
      34: putfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
      37: aload_2
      38: aload_0
      39: getfield      #42                 // Field g:Landroid/database/DataSetObserver;
      42: invokeinterface #50,  2           // InterfaceMethod se/emilsjolander/stickylistheaders/e.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
      47: return

  static java.util.List a(se.emilsjolander.stickylistheaders.a);
    Code:
       0: aload_0
       1: getfield      #37                 // Field b:Ljava/util/List;
       4: areturn

  static void b(se.emilsjolander.stickylistheaders.a);
    Code:
       0: aload_0
       1: invokespecial #106                // Method android/widget/BaseAdapter.notifyDataSetInvalidated:()V
       4: return

  static void c(se.emilsjolander.stickylistheaders.a);
    Code:
       0: aload_0
       1: invokespecial #113                // Method android/widget/BaseAdapter.notifyDataSetChanged:()V
       4: return

  static se.emilsjolander.stickylistheaders.a$a d(se.emilsjolander.stickylistheaders.a);
    Code:
       0: aload_0
       1: getfield      #116                // Field f:Lse/emilsjolander/stickylistheaders/a$a;
       4: areturn

  public long a(int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: iload_1
       5: invokeinterface #110,  2          // InterfaceMethod se/emilsjolander/stickylistheaders/e.a:(I)J
      10: lreturn

  public android.view.View a(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: iload_1
       5: aload_2
       6: aload_3
       7: invokeinterface #75,  4           // InterfaceMethod se/emilsjolander/stickylistheaders/e.a:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
      12: areturn

  void a(android.graphics.drawable.Drawable, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #119                // Field d:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: iload_2
       7: putfield      #121                // Field e:I
      10: aload_0
      11: invokevirtual #122                // Method notifyDataSetChanged:()V
      14: return

  public void a(se.emilsjolander.stickylistheaders.a$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #116                // Field f:Lse/emilsjolander/stickylistheaders/a$a;
       5: return

  public boolean areAllItemsEnabled();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: invokeinterface #127,  1          // InterfaceMethod se/emilsjolander/stickylistheaders/e.areAllItemsEnabled:()Z
       9: ireturn

  public se.emilsjolander.stickylistheaders.f b(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: ifnonnull     19
       4: new           #67                 // class se/emilsjolander/stickylistheaders/f
       7: dup
       8: aload_0
       9: getfield      #44                 // Field c:Landroid/content/Context;
      12: invokespecial #131                // Method se/emilsjolander/stickylistheaders/f."<init>":(Landroid/content/Context;)V
      15: astore_2
      16: goto          24
      19: aload_2
      20: checkcast     #67                 // class se/emilsjolander/stickylistheaders/f
      23: astore_2
      24: aload_0
      25: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
      28: iload_1
      29: aload_2
      30: getfield      #133                // Field se/emilsjolander/stickylistheaders/f.a:Landroid/view/View;
      33: aload_3
      34: invokeinterface #136,  4          // InterfaceMethod se/emilsjolander/stickylistheaders/e.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
      39: astore        6
      41: aconst_null
      42: astore        5
      44: aload_0
      45: iload_1
      46: invokespecial #138                // Method b:(I)Z
      49: ifeq          60
      52: aload_0
      53: aload_2
      54: invokespecial #140                // Method a:(Lse/emilsjolander/stickylistheaders/f;)V
      57: goto          68
      60: aload_0
      61: aload_2
      62: iload_1
      63: invokespecial #142                // Method a:(Lse/emilsjolander/stickylistheaders/f;I)Landroid/view/View;
      66: astore        5
      68: aload         6
      70: instanceof    #144                // class android/widget/Checkable
      73: istore        4
      75: iload         4
      77: ifeq          102
      80: aload_2
      81: instanceof    #146                // class se/emilsjolander/stickylistheaders/b
      84: ifne          102
      87: new           #146                // class se/emilsjolander/stickylistheaders/b
      90: dup
      91: aload_0
      92: getfield      #44                 // Field c:Landroid/content/Context;
      95: invokespecial #147                // Method se/emilsjolander/stickylistheaders/b."<init>":(Landroid/content/Context;)V
      98: astore_3
      99: goto          130
     102: aload_2
     103: astore_3
     104: iload         4
     106: ifne          130
     109: aload_2
     110: astore_3
     111: aload_2
     112: instanceof    #146                // class se/emilsjolander/stickylistheaders/b
     115: ifeq          130
     118: new           #67                 // class se/emilsjolander/stickylistheaders/f
     121: dup
     122: aload_0
     123: getfield      #44                 // Field c:Landroid/content/Context;
     126: invokespecial #131                // Method se/emilsjolander/stickylistheaders/f."<init>":(Landroid/content/Context;)V
     129: astore_3
     130: aload_3
     131: aload         6
     133: aload         5
     135: aload_0
     136: getfield      #119                // Field d:Landroid/graphics/drawable/Drawable;
     139: aload_0
     140: getfield      #121                // Field e:I
     143: invokevirtual #150                // Method se/emilsjolander/stickylistheaders/f.a:(Landroid/view/View;Landroid/view/View;Landroid/graphics/drawable/Drawable;I)V
     146: aload_3
     147: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: aload_1
       5: invokevirtual #155                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
       8: ireturn

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: invokeinterface #158,  1          // InterfaceMethod se/emilsjolander/stickylistheaders/e.getCount:()I
       9: ireturn

  public android.view.View getDropDownView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: checkcast     #4                  // class android/widget/BaseAdapter
       7: iload_1
       8: aload_2
       9: aload_3
      10: invokevirtual #161                // Method android/widget/BaseAdapter.getDropDownView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
      13: areturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: iload_1
       5: invokeinterface #164,  2          // InterfaceMethod se/emilsjolander/stickylistheaders/e.getItem:(I)Ljava/lang/Object;
      10: areturn

  public long getItemId(int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: iload_1
       5: invokeinterface #167,  2          // InterfaceMethod se/emilsjolander/stickylistheaders/e.getItemId:(I)J
      10: lreturn

  public int getItemViewType(int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: iload_1
       5: invokeinterface #171,  2          // InterfaceMethod se/emilsjolander/stickylistheaders/e.getItemViewType:(I)I
      10: ireturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokevirtual #173                // Method b:(ILandroid/view/View;Landroid/view/ViewGroup;)Lse/emilsjolander/stickylistheaders/f;
       7: areturn

  public int getViewTypeCount();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: invokeinterface #176,  1          // InterfaceMethod se/emilsjolander/stickylistheaders/e.getViewTypeCount:()I
       9: ireturn

  public boolean hasStableIds();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: invokeinterface #179,  1          // InterfaceMethod se/emilsjolander/stickylistheaders/e.hasStableIds:()Z
       9: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: invokevirtual #182                // Method java/lang/Object.hashCode:()I
       7: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: invokeinterface #185,  1          // InterfaceMethod se/emilsjolander/stickylistheaders/e.isEmpty:()Z
       9: ireturn

  public boolean isEnabled(int);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: iload_1
       5: invokeinterface #188,  2          // InterfaceMethod se/emilsjolander/stickylistheaders/e.isEnabled:(I)Z
      10: ireturn

  public void notifyDataSetChanged();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: checkcast     #4                  // class android/widget/BaseAdapter
       7: invokevirtual #113                // Method android/widget/BaseAdapter.notifyDataSetChanged:()V
      10: return

  public void notifyDataSetInvalidated();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: checkcast     #4                  // class android/widget/BaseAdapter
       7: invokevirtual #106                // Method android/widget/BaseAdapter.notifyDataSetInvalidated:()V
      10: return

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Lse/emilsjolander/stickylistheaders/e;
       4: invokevirtual #192                // Method java/lang/Object.toString:()Ljava/lang/String;
       7: areturn
}
