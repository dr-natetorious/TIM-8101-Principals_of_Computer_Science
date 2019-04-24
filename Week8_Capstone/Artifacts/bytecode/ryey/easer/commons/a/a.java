public class ryey.easer.commons.a.a {
  public ryey.easer.commons.a.a(android.content.Context, android.widget.Spinner);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #22                 // Field c:Z
       9: aload_0
      10: new           #24                 // class java/util/ArrayList
      13: dup
      14: invokespecial #25                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #27                 // Field d:Ljava/util/List;
      20: aload_0
      21: aload_1
      22: putfield      #29                 // Field a:Landroid/content/Context;
      25: aload_0
      26: aload_2
      27: putfield      #31                 // Field b:Landroid/widget/Spinner;
      30: return

  public ryey.easer.commons.a.a a();
    Code:
       0: aload_0
       1: getfield      #27                 // Field d:Ljava/util/List;
       4: invokeinterface #38,  1           // InterfaceMethod java/util/List.clear:()V
       9: aload_0
      10: areturn

  public ryey.easer.commons.a.a a(java.util.List<java.lang.String>);
    Code:
       0: aload_0
       1: getfield      #27                 // Field d:Ljava/util/List;
       4: aload_1
       5: invokeinterface #43,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      10: pop
      11: aload_0
      12: areturn

  public ryey.easer.commons.a.a a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #22                 // Field c:Z
       5: aload_0
       6: areturn

  public void a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #22                 // Field c:Z
       4: ifeq          20
       7: aload_1
       8: ifnonnull     20
      11: aload_0
      12: getfield      #31                 // Field b:Landroid/widget/Spinner;
      15: iconst_0
      16: invokevirtual #53                 // Method android/widget/Spinner.setSelection:(I)V
      19: return
      20: aload_0
      21: getfield      #31                 // Field b:Landroid/widget/Spinner;
      24: aload_0
      25: getfield      #27                 // Field d:Ljava/util/List;
      28: aload_1
      29: invokeinterface #57,  2           // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
      34: invokevirtual #53                 // Method android/widget/Spinner.setSelection:(I)V
      37: return

  public void b();
    Code:
       0: aload_0
       1: getfield      #22                 // Field c:Z
       4: ifeq          19
       7: aload_0
       8: getfield      #27                 // Field d:Ljava/util/List;
      11: iconst_0
      12: ldc           #59                 // String
      14: invokeinterface #63,  3           // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
      19: new           #65                 // class android/widget/ArrayAdapter
      22: dup
      23: aload_0
      24: getfield      #29                 // Field a:Landroid/content/Context;
      27: ldc           #66                 // int 2131427465
      29: aload_0
      30: getfield      #27                 // Field d:Ljava/util/List;
      33: invokespecial #69                 // Method android/widget/ArrayAdapter."<init>":(Landroid/content/Context;ILjava/util/List;)V
      36: astore_1
      37: aload_1
      38: ldc           #70                 // int 17367048
      40: invokevirtual #73                 // Method android/widget/ArrayAdapter.setDropDownViewResource:(I)V
      43: aload_0
      44: getfield      #31                 // Field b:Landroid/widget/Spinner;
      47: aload_1
      48: invokevirtual #77                 // Method android/widget/Spinner.setAdapter:(Landroid/widget/SpinnerAdapter;)V
      51: aload_0
      52: getfield      #31                 // Field b:Landroid/widget/Spinner;
      55: new           #6                  // class ryey/easer/commons/a/a$1
      58: dup
      59: aload_0
      60: invokespecial #80                 // Method ryey/easer/commons/a/a$1."<init>":(Lryey/easer/commons/a/a;)V
      63: invokevirtual #84                 // Method android/widget/Spinner.setOnItemSelectedListener:(Landroid/widget/AdapterView$OnItemSelectedListener;)V
      66: return

  public java.lang.String c();
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:Landroid/widget/Spinner;
       4: invokevirtual #89                 // Method android/widget/Spinner.getSelectedItem:()Ljava/lang/Object;
       7: checkcast     #91                 // class java/lang/String
      10: astore_2
      11: aload_2
      12: astore_1
      13: aload_0
      14: getfield      #22                 // Field c:Z
      17: ifeq          33
      20: aload_2
      21: astore_1
      22: aload_2
      23: ldc           #59                 // String
      25: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      28: ifeq          33
      31: aconst_null
      32: astore_1
      33: aload_1
      34: areturn
}
