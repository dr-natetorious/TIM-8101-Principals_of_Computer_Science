class android.support.v7.widget.z$a implements android.widget.ListAdapter,android.widget.SpinnerAdapter {
  public android.support.v7.widget.z$a(android.widget.SpinnerAdapter, android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       9: aload_1
      10: instanceof    #6                  // class android/widget/ListAdapter
      13: ifeq          24
      16: aload_0
      17: aload_1
      18: checkcast     #6                  // class android/widget/ListAdapter
      21: putfield      #23                 // Field b:Landroid/widget/ListAdapter;
      24: aload_2
      25: ifnull        94
      28: getstatic     #29                 // Field android/os/Build$VERSION.SDK_INT:I
      31: bipush        23
      33: if_icmplt     66
      36: aload_1
      37: instanceof    #31                 // class android/widget/ThemedSpinnerAdapter
      40: ifeq          66
      43: aload_1
      44: checkcast     #31                 // class android/widget/ThemedSpinnerAdapter
      47: astore_1
      48: aload_1
      49: invokeinterface #35,  1           // InterfaceMethod android/widget/ThemedSpinnerAdapter.getDropDownViewTheme:()Landroid/content/res/Resources$Theme;
      54: aload_2
      55: if_acmpeq     94
      58: aload_1
      59: aload_2
      60: invokeinterface #39,  2           // InterfaceMethod android/widget/ThemedSpinnerAdapter.setDropDownViewTheme:(Landroid/content/res/Resources$Theme;)V
      65: return
      66: aload_1
      67: instanceof    #41                 // class android/support/v7/widget/bl
      70: ifeq          94
      73: aload_1
      74: checkcast     #41                 // class android/support/v7/widget/bl
      77: astore_1
      78: aload_1
      79: invokeinterface #43,  1           // InterfaceMethod android/support/v7/widget/bl.a:()Landroid/content/res/Resources$Theme;
      84: ifnonnull     94
      87: aload_1
      88: aload_2
      89: invokeinterface #45,  2           // InterfaceMethod android/support/v7/widget/bl.a:(Landroid/content/res/Resources$Theme;)V
      94: return

  public boolean areAllItemsEnabled();
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Landroid/widget/ListAdapter;
       4: astore_1
       5: aload_1
       6: ifnull        16
       9: aload_1
      10: invokeinterface #50,  1           // InterfaceMethod android/widget/ListAdapter.areAllItemsEnabled:()Z
      15: ireturn
      16: iconst_1
      17: ireturn

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
      13: invokeinterface #54,  1           // InterfaceMethod android/widget/SpinnerAdapter.getCount:()I
      18: ireturn

  public android.view.View getDropDownView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
      13: iload_1
      14: aload_2
      15: aload_3
      16: invokeinterface #58,  4           // InterfaceMethod android/widget/SpinnerAdapter.getDropDownView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
      21: areturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
      13: iload_1
      14: invokeinterface #62,  2           // InterfaceMethod android/widget/SpinnerAdapter.getItem:(I)Ljava/lang/Object;
      19: areturn

  public long getItemId(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       4: ifnonnull     11
       7: ldc2_w        #65                 // long -1l
      10: lreturn
      11: aload_0
      12: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
      15: iload_1
      16: invokeinterface #68,  2           // InterfaceMethod android/widget/SpinnerAdapter.getItemId:(I)J
      21: lreturn

  public int getItemViewType(int);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokevirtual #72                 // Method getDropDownView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
       7: areturn

  public int getViewTypeCount();
    Code:
       0: iconst_1
       1: ireturn

  public boolean hasStableIds();
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       4: ifnull        21
       7: aload_0
       8: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
      11: invokeinterface #76,  1           // InterfaceMethod android/widget/SpinnerAdapter.hasStableIds:()Z
      16: ifeq          21
      19: iconst_1
      20: ireturn
      21: iconst_0
      22: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: invokevirtual #78                 // Method getCount:()I
       4: ifne          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public boolean isEnabled(int);
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Landroid/widget/ListAdapter;
       4: astore_2
       5: aload_2
       6: ifnull        17
       9: aload_2
      10: iload_1
      11: invokeinterface #82,  2           // InterfaceMethod android/widget/ListAdapter.isEnabled:(I)Z
      16: ireturn
      17: iconst_1
      18: ireturn

  public void registerDataSetObserver(android.database.DataSetObserver);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       4: ifnull        17
       7: aload_0
       8: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
      11: aload_1
      12: invokeinterface #86,  2           // InterfaceMethod android/widget/SpinnerAdapter.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
      17: return

  public void unregisterDataSetObserver(android.database.DataSetObserver);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
       4: ifnull        17
       7: aload_0
       8: getfield      #21                 // Field a:Landroid/widget/SpinnerAdapter;
      11: aload_1
      12: invokeinterface #89,  2           // InterfaceMethod android/widget/SpinnerAdapter.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
      17: return
}
