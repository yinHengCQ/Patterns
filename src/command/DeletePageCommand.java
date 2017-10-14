package command;

public class DeletePageCommand extends Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		pg.find();
		rg.delete();
		rg.plan();
	}

}
