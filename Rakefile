def run t
  print "#{t}\n"
  `#{t}`
end

task default: :serve
task :serve do
  system 'lein figwheel'
end

task :sass do
  run 'sass --watch src/sass:resources/public/css'
end

task 'sass:once' do
  run 'sass --update src/sass:resources/public/css'
end
