class se.emilsjolander.stickylistheaders.a$2 implements android.view.View$OnClickListener {
  final int a;

  final se.emilsjolander.stickylistheaders.a b;

  se.emilsjolander.stickylistheaders.a$2(se.emilsjolander.stickylistheaders.a, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field b:Lse/emilsjolander/stickylistheaders/a;
       5: aload_0
       6: iload_2
       7: putfield      #20                 // Field a:I
      10: aload_0
      11: invokespecial #23                 // Method java/lang/Object."<init>":()V
      14: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #18                 // Field b:Lse/emilsjolander/stickylistheaders/a;
       4: invokestatic  #30                 // Method se/emilsjolander/stickylistheaders/a.d:(Lse/emilsjolander/stickylistheaders/a;)Lse/emilsjolander/stickylistheaders/a$a;
       7: ifnull        45
      10: aload_0
      11: getfield      #18                 // Field b:Lse/emilsjolander/stickylistheaders/a;
      14: getfield      #33                 // Field se/emilsjolander/stickylistheaders/a.a:Lse/emilsjolander/stickylistheaders/e;
      17: aload_0
      18: getfield      #20                 // Field a:I
      21: invokeinterface #38,  2           // InterfaceMethod se/emilsjolander/stickylistheaders/e.a:(I)J
      26: lstore_2
      27: aload_0
      28: getfield      #18                 // Field b:Lse/emilsjolander/stickylistheaders/a;
      31: invokestatic  #30                 // Method se/emilsjolander/stickylistheaders/a.d:(Lse/emilsjolander/stickylistheaders/a;)Lse/emilsjolander/stickylistheaders/a$a;
      34: aload_1
      35: aload_0
      36: getfield      #20                 // Field a:I
      39: lload_2
      40: invokeinterface #43,  5           // InterfaceMethod se/emilsjolander/stickylistheaders/a$a.a:(Landroid/view/View;IJ)V
      45: return
}
