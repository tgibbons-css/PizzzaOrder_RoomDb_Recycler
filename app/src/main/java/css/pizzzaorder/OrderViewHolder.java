package css.pizzzaorder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/***
 *  The ViewHolder manages all the widgets or views in the XML layout for each row
 */
public class OrderViewHolder extends RecyclerView.ViewHolder{

    TextView textViewOrderDetail;

    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewOrderDetail = (TextView) itemView.findViewById(R.id.textViewOrder);

    }

}
