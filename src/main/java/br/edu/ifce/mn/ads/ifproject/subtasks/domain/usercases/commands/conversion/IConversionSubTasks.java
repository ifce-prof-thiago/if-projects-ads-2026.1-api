package br.edu.ifce.mn.ads.ifproject.subtasks.domain.usercases.commands.conversion;

import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.create.ICreateUser;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

public interface IConversionSubTasks {

    public void execute(ConvertToTaskInput input);

}
